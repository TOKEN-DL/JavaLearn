package com.token.dao;

import com.token.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> getUserLike(String name);


    //查询全部用户
    List<User> getUserList();
    //根据id查询参数

    User getUserById(int id);

    User getUserById2(Map<String,Object> map);

    //万能的map，不需要知道数据库里有什么，只需要知道插入什么键
    int addUser2(Map<String,Object> map);

    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

}
