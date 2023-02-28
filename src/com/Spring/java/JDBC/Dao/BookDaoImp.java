package com.Spring.java.JDBC.Dao;

import com.Spring.java.JDBC.Entity.BookUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImp implements BookDao {
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法
    @Override
    public void add(BookUser bookUser) {
        //1.创建sql语句
        String sql = "insert into t_book(book_id, book_name, bstatus) values(?, ?, ?)";
        //2.调用方法实现添加
        Object[] args = {bookUser.getBookId(), bookUser.getBookName(), bookUser.getBookStatus()};
        var res = jdbcTemplate.update(sql, args);
        System.out.println(res);
    }

    @Override
    public void update(BookUser bookUser) {
        //1.创建sql语句
        String sql = "update t_book set book_name=?, bstatus=? where book_id=?";
        //2.调用方法实现修改
        Object[] args = {bookUser.getBookName(), bookUser.getBookStatus(), bookUser.getBookId()};
        var res = jdbcTemplate.update(sql, args);
        System.out.println(res);
    }

    @Override
    public void delete(String id) {
        //1.创建sql语句
        String sql = "delete from t_book where book_id=?";
        //2.调用方法实现删除
        Object[] args = {id};
        var res = jdbcTemplate.update(sql, args);
        System.out.println(res);
    }

    @Override
    public int count() {
        //1.创建sql语句
        String sql = "select count(*) from t_book";
        //2.调用方法实现查询
        return jdbcTemplate.queryForObject(sql, int.class);
    }

    @Override
    public BookUser info(String id) {
        //1.创建sql语句
        String sql = "select * from t_book where book_id = ?";
        //2.调用方法实现查询
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<BookUser>(BookUser.class), id);
    }

    @Override
    public List<BookUser> list() {
        //1.创建sql语句
        String sql = "select * from t_book";
        //2.调用方法实现查询
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<BookUser>(BookUser.class));
    }
}
