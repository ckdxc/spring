package cn.xc.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log{
    public void before(){
        System.out.println("----方法执行前----");
    }
    public void after(){
        System.out.println("----方法执行后----");
    }
}
