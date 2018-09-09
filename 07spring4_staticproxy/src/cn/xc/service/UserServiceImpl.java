package cn.xc.service;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        log("add");
        System.out.println("添加用户");
    }

    @Override
    public void update() {
        log("update");
        System.out.println("修改用户");
    }

    @Override
    public void delete() {
        log("delete");
        System.out.println("删除用户");
    }

    @Override
    public void search() {
        log("search");
        System.out.println("查找用户");
    }
    public void log(String methodName){
        System.out.println("执行"+methodName+"方法");
    }
}
