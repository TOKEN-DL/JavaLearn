package dao;

import com.token.dao.UserDao;
import com.token.pojo.User;
import com.token.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserByLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        logger.info("测试进入getUserByLike方法成功");
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }


        sqlSession.close();
    }


    @Test
    public void testLog4j(){
        logger.info("info:进入了tesetLog4j方法");
        logger.debug("debug:进入了tesetLog4j方法");
        logger.error("error:进入了tesetLog4j方法");
    }

    @Test
    public void getUserByLimit1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 2);

        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
    }






}
