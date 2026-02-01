import com.token.dao.UserDaoImpl;
import com.token.dao.UserDaoMysqlImpl;
import com.token.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext: 拿到Spring的容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //需要什么就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();


    }
}
