package cn.xc.factory;

import cn.xc.vo.User;

public class UserFactory {
    public static User newInstance(String name){
        return new User(name);
    }
}
