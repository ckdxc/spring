package cn.xc.factory;

import cn.xc.vo.User;

public class UserDynamicFactory {
    public User newInstance(String name){
        return new User(name);
    }
}
