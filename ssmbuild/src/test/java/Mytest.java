import com.token.pojo.Books;
import com.token.service.BookService;
import com.token.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class Mytest
{
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for (Books books: bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
