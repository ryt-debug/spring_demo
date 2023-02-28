package com.Spring.java.demo;

import org.springframework.stereotype.Repository;

@Repository
public class UserInterImp implements UserInter{
    @Override
    public void hello() {
        System.out.println("Hello...");
    }
}
