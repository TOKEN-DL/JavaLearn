package com.token.demo03;

import com.token.demo01.Rent;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;


//自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHose();

        //动态代理的本质就是反射机制实现
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    public void seeHose(){
        System.out.println("带看房子");
    }

    public  void  fare(){
        System.out.println("收中介费");
    }
}
