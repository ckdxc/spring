package cn.xc.log;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /**
     * @param returnValue 返回值
     * @param method 被调用方法对象
     * @param args 被调用的方法的参数
     * @param target 目标对象(被代理的类)
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行"+"返回值:"+returnValue.toString());
    }
}
