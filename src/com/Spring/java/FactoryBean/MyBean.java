package com.Spring.java.FactoryBean;

import com.Spring.java.collectiontype.Stu;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Stu> {

    //定义返回的bean的类型
    @Override
    public Stu getObject() throws Exception {
        return new Stu();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
