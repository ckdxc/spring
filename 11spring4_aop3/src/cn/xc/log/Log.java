package cn.xc.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class Log{
    @Before("execution(* cn.xc.service.*.*(..))")
    public void before(){
        System.out.println("----方法执行前----");
    }
    @After("execution(* cn.xc.service.*.*(..))")
    public void after(){
        System.out.println("----方法执行后----");
    }
    @Around("execution(* cn.xc.service.*.*(..))")
    public void around(ProceedingJoinPoint jp){
        System.out.println("环绕前");
        System.out.println("签名"+jp.getSignature());
        System.out.println("环绕后");
    }
}
