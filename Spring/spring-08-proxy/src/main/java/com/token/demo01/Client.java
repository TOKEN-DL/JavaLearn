package com.token.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        // 代理
        Proxy proxy = new Proxy(host);
        //代理角色一般会有附属操作
        proxy.seeHouse();
        proxy.hetong();

        proxy.rent();
    }
}
