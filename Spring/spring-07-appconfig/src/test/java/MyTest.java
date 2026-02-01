import com.token.MyConfig;
import com.token.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 如果完全十一号了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        User user = context.getBean("getUser", User.class);
        System.out.println(user.getUsername());
    }
}
