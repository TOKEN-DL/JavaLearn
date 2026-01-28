import com.token.dao.BlogMapper;
import com.token.pojo.Blog;
import com.token.utils.IDutild;
import com.token.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    @Test
    public void addInitBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutild.getId());
        blog.setTitle("芜湖Java真简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setView(9999);

        mapper.addBlog(blog);

        blog.setId(IDutild.getId());
        blog.setTitle("Python 如此简单");
        mapper.addBlog(blog);

        blog.setId(IDutild.getId());
        blog.setTitle("Spring 如此简单");
        mapper.addBlog(blog);


        blog.setId(IDutild.getId());
        blog.setTitle("Docker 如此简单");
        mapper.addBlog(blog);

        sqlSession.close();

    }



    @Test
    public void queryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","芜湖Java真简单");

        List<Blog> blogs = mapper.queryBlogIF(map);


        for (Blog blog : blogs) {
            System.out.println(blog);
        }


    }

    @Test
    public void queryBlogIF1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("view",9999);

        List<Blog> blogs = mapper.queryBlogChoose(map);


        for (Blog blog : blogs) {
            System.out.println(blog);
        }


    }
}
