package bh.db.ssm.service.admin;

import bh.db.ssm.entity.User;
import bh.db.ssm.entity.UserInfo;
import bh.db.ssm.exception.MyRedisException;

import java.util.List;

/**
 * @author BH-DB-SHY
 * @create 2019-11-03-16:46
 */
public interface UserService {

	/**
	 * 查询所有的用户信息
	 * @return
	 */
	List<User> findAllUser() throws MyRedisException;

	/**
	 * 描述：插入用户信息
	 * @param user 用户信息
	 * @return	影响行数
	 */
	Integer insertUser(User user, UserInfo userInfo);

	/**
	 * 描述:用户登陆功能
	 */
	User login(User user);

}
