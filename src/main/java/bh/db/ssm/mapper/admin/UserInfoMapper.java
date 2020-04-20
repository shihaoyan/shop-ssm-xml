package bh.db.ssm.mapper.admin;

import bh.db.ssm.entity.User;
import bh.db.ssm.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author 石皓岩
 * @create 2019-11-17-16:39
 * 描述：此类主要用来操作tb_userinfo表
 */
@Repository
public interface UserInfoMapper {
	/**
	 * 查询用户信息，通过用户id
	 * @param id
	 * @return
	 */
	UserInfo findUserInfoById(Integer id);

	/**
	 * 插入用户信息
	 * @param user
	 */
	void insertUserInfo(UserInfo userInfo);
}
