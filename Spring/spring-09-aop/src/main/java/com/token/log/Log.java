package com.token.log;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    //method； 要执行的目标对象的方法
    //args： 参数
    //target： 目标对象
    @Override
    public void before(Method method, @Nullable Object[] args, @Nullable Object target) throws Throwable {
        System.out.println(target.getClass().getName() + ": " + method.getName()+"被执行了");
    }
}
