package bh.db.ssm;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author BH-DB-SHY
 * @create 2019-11-04-13:58
 */
public class TestDemo {

	@Test
	public void test1(){
		//我应该加载配置文件
		ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:spring/*.xml");
		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

	@Test
	public void test2(){
		//我应该加载配置文件
		ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:spring/*.xml");
		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}


}
