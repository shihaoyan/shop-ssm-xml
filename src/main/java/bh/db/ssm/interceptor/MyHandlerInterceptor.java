package bh.db.ssm.interceptor;

import bh.db.ssm.annotation.MvcAnnotatation;
import bh.db.ssm.commons.MyConstant;
import bh.db.ssm.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 石皓岩
 * @create 2019-11-13-21:23
 * 描述：
 */
@MvcAnnotatation
public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	/**
	 * 项目的更目录
	 */
	@Value("${ROOT_URL}")
	private String ROOT_URL;

	/**
	 * 拦截器，防止用户未登录直接进入后台
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		//首先应该查看session中是否存在用户信息
		//如果存在用户信息则放行
		//如果不存在用户信息直接跳转到登录界面
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user == null) {
			//表示未i登陆了,跳转到登陆界面
			response.sendRedirect(ROOT_URL + "/page/toLogin");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	}
}
