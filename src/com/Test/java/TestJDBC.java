package com.Test.java;

import com.Spring.java.JDBC.Entity.BookUser;
import com.Spring.java.JDBC.Service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJDBC {
    @Test
    public void testJdbc() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans8.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        //添加
//        BookUser bookUser1 = new BookUser();
//        bookUser1.setBookId("2");
//        bookUser1.setBookName("Java");
//        bookUser1.setBookStatus("Normal");
//        bookService.addBook(bookUser1);

//        //修改
//        BookUser bookUser2 = new BookUser();
//        bookUser2.setBookId("1");
//        bookUser2.setBookName("JDBC");
//        bookUser2.setBookStatus("Not Normal");
//        bookService.updateBook(bookUser2);

//        //删除
//        String id = "1";
//        bookService.deleteBook(id);

//        //查询表中记录数
//        System.out.println(bookService.bookCount());

//        //测试查询返回对象
//        BookUser bookUser = bookService.bookInfo("2");
//        System.out.println(bookUser);

        //测试查询返回集合
        System.out.println(bookService.bookList());

    }
}
