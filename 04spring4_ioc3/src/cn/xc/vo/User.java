package cn.xc.vo;

public class User {
    private String name;
    private boolean sex;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public User(String name) {
        this.name = name;
        System.out.println("有参构造方法");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println();
    }
}
