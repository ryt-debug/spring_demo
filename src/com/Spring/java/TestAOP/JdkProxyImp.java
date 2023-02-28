package com.Spring.java.TestAOP;

public class JdkProxyImp implements JdkProxy{

    @Override
    public int add(int a, int b) {
        System.out.println("Add...");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("Update...");
        return id;
    }
}
