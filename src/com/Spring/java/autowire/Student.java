package com.Spring.java.autowire;

public class Student {
    private Clazz clazz;

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "clazz=" + clazz +
                '}';
    }
}
