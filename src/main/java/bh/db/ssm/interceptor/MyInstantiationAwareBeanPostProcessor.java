package bh.db.ssm.interceptor;

import bh.db.ssm.annotation.MvcAnnotatation;
import bh.db.ssm.controller.admin.LoginController;
import bh.db.ssm.service.admin.impl.UserServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author 石皓岩
 * @create 2020-02-08 21:07
 * 描述：
 */
//@MvcAnnotatation
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(bean instanceof LoginController){
            LoginController loginController = (LoginController)bean;
            Class<? extends LoginController> clazz = loginController.getClass();
            try {
                Field userService = clazz.getDeclaredField("userService");
                userService.setAccessible(true);
                userService.set(loginController,new UserServiceImpl());

            } catch (Exception e) {
                e.printStackTrace();
            }
            return true;
        }
        return true;


    }
}
