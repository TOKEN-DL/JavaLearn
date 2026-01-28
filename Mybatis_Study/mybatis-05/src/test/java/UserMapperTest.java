import com.token.dao.UserMapper;
import com.token.pojo.User;
import com.token.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {


    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = userMapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        User user = userMapper.getUserById(1);
//        System.out.println(user);
//        sqlSession.close();

//       userMapper.updateUser(new User(21, "Hello111", "55345345"));
        userMapper.deleteUser(21);

        sqlSession.close();
    }
}
