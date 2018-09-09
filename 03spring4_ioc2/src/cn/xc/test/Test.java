package cn.xc.test;

import cn.xc.service.UserService;
import cn.xc.serviceimpl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService us = (UserService)context.getBean("service");
        us.getUser();
    }
}
