package com.token.controller;


import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.token.pojo.User;
import com.token.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    // 出现乱码设置  produces = "application/json;charset=uft-8"
    @RequestMapping("/j1")
    @ResponseBody //加这个后就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {


        //jackson
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User(1, "时雨", 3);

        String str = mapper.writeValueAsString(user);

        return str;
    }


    // 出现乱码设置  produces = "application/json;charset=uft-8"
    @RequestMapping("/j2")
    @ResponseBody //加这个后就不会走视图解析器，会直接返回一个字符串
    public String json2() throws JsonProcessingException {



        List<User> users = new ArrayList<User>();

        //创建一个对象
        User user1 = new User(1, "时雨1", 3);
        User user2 = new User(1, "时雨2", 3);
        User user3 = new User(1, "时雨3", 3);
        User user4 = new User(1, "时雨4", 3);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        return JsonUtils.getJson(users);
    }


    @RequestMapping("/j3")
    @ResponseBody //加这个后就不会走视图解析器，会直接返回一个字符串
    public String json3() throws JsonProcessingException {


//        //jackson
//        ObjectMapper mapper = new ObjectMapper();
//
//
//        //使用jackson来格式化
//        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
//
//        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

        Date date = new Date();
        //自定义日期格式
        // String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }




    @RequestMapping("/j4")
    @ResponseBody //加这个后就不会走视图解析器，会直接返回一个字符串
    public String json4() throws JsonProcessingException {



        List<User> users = new ArrayList<User>();

        //创建一个对象
        User user1 = new User(1, "时雨1", 3);
        User user2 = new User(1, "时雨2", 3);
        User user3 = new User(1, "时雨3", 3);
        User user4 = new User(1, "时雨4", 3);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        String string = JSON.toJSONString(users);

        System.out.println("******Java 对象 转 JSON字符串 ******");
        String str1 = JSON.toJSONString(users);
        System.out.println("JSON.toJSONString(users)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("******JSON字符串 转 Java对象 ******");
        User jp_user1 = JSON.parseObject(str2, User.class);
        System.out.println("JSON.toJSONString(str2,User.class)==>"+jp_user1);






        return string;


    }

}
