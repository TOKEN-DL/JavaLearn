package com.token.service;

import com.token.dao.UserDao;
import com.token.dao.UserDaoImpl;
import com.token.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();

    //调用的实现不要在程序里写死，用户可以根据需要选择调用响应的程序
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
