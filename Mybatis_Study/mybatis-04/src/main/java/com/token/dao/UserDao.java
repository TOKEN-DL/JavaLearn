package com.token.dao;

import com.token.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserDao {



    //查询全部用户
    List<User> getUserList();
    //根据id查询参数

    User getUserById(int id);


    List<User> getUserByLimit(HashMap<String, Integer> map);

}
