package com.token.demo02;

public class UserServiceProxy implements UserService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        userService.update();
    }

    @Override
    public void query() {
        userService.query();
    }

    //日志方法
    public void log(String msg) {
        System.out.println("[Debug]使用了"+msg+"方法");
    }
}
