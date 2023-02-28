package com.Spring.java.JDBC.Service;

import com.Spring.java.JDBC.Dao.BookDao;
import com.Spring.java.JDBC.Entity.BookUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    //注入Dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(BookUser bookUser){
        bookDao.add(bookUser);
    }

    //修改的方法
    public void updateBook(BookUser bookUser){
        bookDao.update(bookUser);
    }

    //删除的方法
    public void deleteBook(String id){
        bookDao.delete(id);
    }

    //查询记录值
    public int bookCount(){
        return bookDao.count();
    }

    //查询图书信息
    public BookUser bookInfo(String id){
        return bookDao.info(id);
    }

    public List<BookUser> bookList(){
        return bookDao.list();
    }
}
