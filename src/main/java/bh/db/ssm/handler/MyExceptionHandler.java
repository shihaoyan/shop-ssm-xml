package bh.db.ssm.handler;

import bh.db.ssm.exception.MyRedisException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 石皓岩
 * @create 2019-11-13-20:49
 * 描述：全局异常处理器，我希望在出错的时候进入这个全局异常处理器，并且输入到文件中，通知管理员
 */
@ControllerAdvice
public class MyExceptionHandler {

	private static final Logger logger  = LoggerFactory.getLogger(MyExceptionHandler.class);


	@ExceptionHandler(Exception.class)
	public ModelAndView errorHandler(Exception e){

		ModelAndView model = new ModelAndView();
		model.setViewName("error");
		model.addObject("code",500);
		model.addObject("msg","页面出错了");
		//打印日志
		logger.info("系统出现异常，进入全局异常处理器");
		//控制台打印异常
		e.printStackTrace();
		//向日志文件中写入异常
		logger.error("系统发生异常",e);
		//获取管理员的信息
		//发送邮件通知管理员
		//并把文件发送给管理员

		return	model;
	}

	/**
	 * redis出现异常，并不需要进行界面跳转
	 * @param e
	 */
	@ExceptionHandler(MyRedisException.class)
	public void errorHandler(MyRedisException e){

		ModelAndView model = new ModelAndView();
		model.setViewName("error");
		model.addObject("code",500);
		model.addObject("msg","页面出错了");
		//打印日志
		logger.info("系统出现异常，进入全局异常处理器");
		//控制台打印异常
		e.printStackTrace();
		//向日志文件中写入异常
		logger.error("系统发生异常",e);
		//获取管理员的信息
		//发送邮件通知管理员
		//并把文件发送给管理员

	}

	@ExceptionHandler(MyJsonException.class)
	public void errorHandler(MyJsonException e){

		ModelAndView model = new ModelAndView();
		model.setViewName("error");
		model.addObject("code",500);
		model.addObject("msg","页面出错了");
		//打印日志
		logger.info("系统出现异常，进入全局异常处理器");
		//控制台打印异常
		e.printStackTrace();
		//向日志文件中写入异常
		logger.error("系统发生异常",e);
		//获取管理员的信息
		//发送邮件通知管理员
		//并把文件发送给管理员

	}




}
