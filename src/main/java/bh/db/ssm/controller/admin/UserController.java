package bh.db.ssm.controller.admin;

import bh.db.ssm.entity.User;
import bh.db.ssm.entity.UserInfo;
import bh.db.ssm.exception.MyRedisException;
import bh.db.ssm.service.admin.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author BH-DB-SHY
 * @create 2019-11-03-16:57
 * 描述：用户controller
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 查询所有用户信息
	 * @return
	 */
	@GetMapping("/user/list")
	@ResponseBody
	public List<User> list() throws UnsupportedEncodingException, MyRedisException {
		List<User> result = userService.findAllUser();
		return result;
	}

	/**
	 *
	 * @param user 携带前端传递过来的用户信息
	 * @return 插入用户的id
	 */
	@RequestMapping("/user/insert")
	@ResponseBody
	public Integer insert(User user, UserInfo userInfo){
		Integer influenceRowNum = userService.insertUser(user,userInfo);
		return influenceRowNum;
	}





}
