package bh.db.ssm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 石皓岩
 * @create 2019-11-12-19:45
 * 描述：日志切面,必须标识为组件
 */
@Component
@Aspect
public class LogAspects {

	@Pointcut("execution(public Integer bh.db.ssm.service.admin.UserService.*(..))")
	public void pointCut(){};


	/**
	 * 精确的切入点表达式
	 * JoinPoint:连接点对象，包含了连接点相关的信息，方法名，方法参数，方法返回值
	 */
	@Before("execution(public Integer bh.db.ssm.service.admin.UserService.insertUser(..))")
	public void beforeMethod(JoinPoint joinPoint){
		//获取方法的参数
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			//打印参数
			System.out.println(arg);
		}
	}
	@After("execution(public Integer bh.db.ssm.service.admin.UserService.insertUser(..))")
	public void afterMethod(JoinPoint joinPoint){
		//获取方法的参数
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			//打印参数
			System.out.println(arg);
		}
	}

}
