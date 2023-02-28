package com.Spring.java.JDBC.Dao;

import com.Spring.java.JDBC.Entity.BookUser;

import java.util.List;

public interface BookDao {
    //添加的方法
    void add(BookUser bookUser);
    //修改的方法
    void update(BookUser bookUser);
    //删除的方法
    void delete(String id);
    //查询记录数
    int count();

    BookUser info(String id);

    List<BookUser> list();
}
