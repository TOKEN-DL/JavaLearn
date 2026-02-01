package com.token;


import com.token.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //这个也会被Spring容器注册在容器中，就是一个Component
@ComponentScan("com.token.pojo")  // 扫描包
@Import(MyConfig2.class)   //import另一个配置1文件
public class MyConfig {

    //注册一个bean，就相当于我们之前写的一个bean标签
    @Bean
    public User getUser(){
        return new User(); // 就是返回要注入到bean的对象
    }
}
