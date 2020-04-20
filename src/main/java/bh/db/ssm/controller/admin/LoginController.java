package bh.db.ssm.controller.admin;

import bh.db.ssm.commons.MyConstant;
import bh.db.ssm.commons.pojo.ShopResult;
import bh.db.ssm.entity.User;
import bh.db.ssm.service.admin.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author 石皓岩
 * @create 2019-11-13-21:53
 * 描述：
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 登陆成功跳转到主界面
     *
     * @param json
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public ShopResult login(User user, HttpSession session) {
        //从数据库中查询数据
        User login = userService.login(user);
        //失败，返回用户名密码错误
        if (login == null) {
            //失败，设置登陆失败信息
            return ShopResult.build(MyConstant.NO, "用户名、密码错误或用户未激活", null);
        }
        //把登陆设置到session中
        session.setAttribute("user", login);
        //成功返回到主界面
        return ShopResult.ok();

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {

        //清空session信息
        session.removeAttribute("user");

        //重定向到主界面
        return "redirect:/page/toLogin";
    }

}
