package com.Spring.java.AnnoAOP;

import org.springframework.stereotype.Component;

//被增强类
@Component
public class AnnoTestClass {
    public void add(){
        //int i = 1 / 0;
        System.out.println("add...");
    }
}
