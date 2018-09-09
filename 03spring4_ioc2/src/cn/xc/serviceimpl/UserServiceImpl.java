package cn.xc.serviceimpl;

import cn.xc.dao.UserDao;
import cn.xc.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao = null;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void getUser(){
        userDao.getUser();
    }
}
