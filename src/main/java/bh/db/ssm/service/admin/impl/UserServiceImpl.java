package bh.db.ssm.service.admin.impl;

import bh.db.ssm.entity.User;
import bh.db.ssm.entity.UserInfo;
import bh.db.ssm.jedis.JedisClient;
import bh.db.ssm.mapper.admin.UserInfoMapper;
import bh.db.ssm.mapper.admin.UserMapper;
import bh.db.ssm.service.admin.UserService;
import bh.db.ssm.utils.Encrypt;
import bh.db.ssm.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author BH-DB-SHY
 * @create 2019-11-03-16:49
 */
@Service
public class UserServiceImpl implements UserService {

	/**
	 * 对用户表进行crud的mapper
	 */
	@Autowired
	private UserMapper userMapper;
	/**
	 * 对用户信息进行crud的mapper
	 */
	@Autowired
	private UserInfoMapper userInfoMapper;
	/**
	 * 进行redis操作的客户端
	 */
	@Autowired
	private JedisClient jedisClient;
	/**
	 * 存在redis中的user的key
	 */
	@Value("${USERS_KEY}")
	private String USERS_KEY;
	/**
	 * 用户状态
	 */
	@Value("${USER_STATUS}")
	private Integer USER_STATUS;
	/**
	 * 盐
	 */
	@Value("${SALT}")
	private String SALT;
	/**
	 * 加盐次数
	 */
	@Value("${NUMBER}")
	private Integer NUMBER;
	/**
	 * 是否开启缓存
	 */
	@Value("${CACHE_IS_OPEN}")
	private Boolean CACHE_IS_OPEN;

	/**
	 * 查询所有用户信息
	 * @return
	 */
	@Override
	public List<User> findAllUser() {
		//首先应该判断是否开启了缓存
		if(CACHE_IS_OPEN){
			//查询缓存,为了防止缓存失效，所以必须捕获异常信息
			try {
				String users_key = jedisClient.get(USERS_KEY);
				if(StringUtils.isNotBlank(users_key)){
					return JsonUtils.jsonToList(users_key, User.class);
				}
			}catch (Exception e){
				//这个异常对系统无重大影响，所以我抛出一个自定义的RedisService异常
				e.printStackTrace();
			}
		}
		//没查询到缓存直接去数据库中查询
		List<User> result = userMapper.findAllUser();
		//如果没有开启缓存就没有必要添加缓存了
		try{
			if (CACHE_IS_OPEN){
				jedisClient.set(USERS_KEY,JsonUtils.objectToJson(result));
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 插入用户信息
	 * @param user
	 * @return
	 */
	@Override
	public Integer insertUser(User user,UserInfo userInfo) {
		//首先应该补全用户信息
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		user.setCreateData(sf.format(new Date()));
		user.setUpdateData(sf.format(new Date()));
		//应该把密码通过md5进行加密，并且使用盐
		String password = Encrypt.md5(user.getPassword(), user.getUsername() + SALT, NUMBER + 1);
		user.setPassword(password);
		user.setState(USER_STATUS);
		//这个是插入到用户表中
		Integer num = userMapper.insertUser(user);
		//接下来插入到用户信息表，并且需要拼装数据
		userInfo.setUid(user.getId());
		userInfo.setState(user.getState());
		//这个应该插入用户信息
		userInfoMapper.insertUserInfo(userInfo);
		//返回新增用户的id
		return num;
	}

	/**
	 * 登陆用户
	 * @param user
	 * @return
	 */
	@Override
	public User login(User user) {
        System.out.println(user);
		//解密
		String md5Password = Encrypt.md5(user.getPassword(), user.getUsername() + SALT, NUMBER + 1);
		user.setPassword(md5Password);
		//查询出用户信息
		user = userMapper.login(user);
		return user;
	}
}
