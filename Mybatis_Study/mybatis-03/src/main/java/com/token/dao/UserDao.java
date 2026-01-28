package com.token.dao;

import com.token.pojo.User;

import java.util.List;

public interface UserDao {



    //查询全部用户
    List<User> getUserList();
    //根据id查询参数

    User getUserById(int id);

    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);

}
