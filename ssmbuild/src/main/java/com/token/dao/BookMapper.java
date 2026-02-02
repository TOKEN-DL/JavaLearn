package com.token.dao;

import com.token.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books book);

    //删除一本书
    int deleteBookById(@Param("bookId") int id);


    //更新一本书
    int updateBook(Books book);


    //查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询全部书
    List<Books> queryAllBook();

    Books queryBookByName(@Param("bookName") String bookName);

}
