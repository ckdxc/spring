package cn.xc.daoimpl;

import cn.xc.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Oracle----");
    }
}
