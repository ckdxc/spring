package cn.xc.dynamicproxy;

import cn.xc.service.UserService;
import cn.xc.service.UserServiceImpl;

public class Client {
    public static void main(String[] args){
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
