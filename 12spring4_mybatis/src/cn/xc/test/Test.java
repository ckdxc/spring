package cn.xc.test;

import cn.xc.dao.UserDao;
import cn.xc.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;


public class Test {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao)context.getBean("userDao");
        User user = userDao.selectUser(2);
        System.out.println(user);
        System.out.println(userDao.remove(1));
        System.out.println(userDao.addUser(user));
//        List<User> users = userDao.selectAll();
//        for(User user:users){
//            System.out.println(user);
//        }
    }
}
