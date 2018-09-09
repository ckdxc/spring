package cn.xc.daoimpl;

import cn.xc.dao.UserDao;

public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser(){
        System.out.println("Mysql----");
    }
}
