package com.Spring.java;

import com.Spring.java.dao.UserDao;
import com.Spring.java.dao.UserDaoImp;

public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add...");
        userDao.update();
    }
}
