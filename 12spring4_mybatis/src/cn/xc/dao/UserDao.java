package cn.xc.dao;

import cn.xc.vo.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
    User selectUser(int id);
    int addUser(User user);
    int remove(int id);
}
