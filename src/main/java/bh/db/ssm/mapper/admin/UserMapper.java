package bh.db.ssm.mapper.admin;

import bh.db.ssm.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author BH-DB-SHY
 * @create 2019-11-03-16:49
 * 描述：用户的mapper
 */
public interface UserMapper {

	/**
	 * 查询所有的用户
	 *
	 * @return
	 */
	List<User> findAllUser();

	/**
	 * 插入用户信息
	 * @param user
	 * @return
	 */
	Integer insertUser(User user);


	/**
	 * 登陆用户
	 * @param user
	 */
	User login(User user);

	/**
	 * 获取每天的的新增用户量
	 * @param startDay
	 * @param endDay
	 * @return
	 */
	Integer countNewUserForDay(String startDay, String endDay);

}
