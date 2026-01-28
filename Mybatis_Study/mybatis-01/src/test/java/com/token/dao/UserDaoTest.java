package com.token.dao;

import com.token.pojo.User;
import com.token.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    @Test
    public void getUserByLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
//        Map<String,Object> map = new HashMap<>();
//        map.put("id",1);
        List<User> userList = mapper.getUserLike("%龙%");
        for (User user : userList) {
            System.out.println(user);
        }


        sqlSession.close();
    }


    @Test
    public void test(){
        //第一步，获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.print("数据库连接成功");
        //第二部，执行
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();


        // List<User> userList1 = sqlSession.selectList("com.token.dao.UserDao.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();

    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.print("数据库连接成功");
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    public void getUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.print("数据库连接成功");
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 1);

        User user = mapper.getUserById2(map);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void addUse(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.addUser(new User(9,"杨过", "12277443435435"));

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUse(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.updateUser(new User(9, "小龙女", "123456"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUse(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(7);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUse2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", 11);

        map.put("password","12131313121");


        mapper.addUser2(map);

        sqlSession.close();
    }



}
