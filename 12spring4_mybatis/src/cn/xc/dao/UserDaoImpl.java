package cn.xc.dao;

import cn.xc.vo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao{
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectAll() {
        return sqlSession.selectList("cn.xc.vo.user.mapper.selectUser");
    }
    @Override
    public User selectUser(int id) {
        return sqlSession.selectOne("cn.xc.vo.user.mapper.selectUser",id);
    }

    @Override
    public int addUser(User user) {
        return sqlSession.insert("cn.xc.vo.user.mapper.add",user);
    }

    @Override
    public int remove(int id) {
        return sqlSession.delete("cn.xc.vo.user.mapper.remove",id);
    }
}
