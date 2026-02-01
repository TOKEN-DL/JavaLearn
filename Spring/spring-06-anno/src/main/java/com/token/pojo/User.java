package com.token.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



// 等价于 <bean id="user" class="com.token.pojo.User"/>
@Component
@Scope("prototype")
public class User {
    // 等价于  <property name="name" value="时雨"/>
    @Value("时雨")
    public String name;
}
