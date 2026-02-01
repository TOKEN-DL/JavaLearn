import com.token.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
