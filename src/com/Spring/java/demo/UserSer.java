package com.Spring.java.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "userSer")//注解的value值可以省略不写，默认值是类名小写首字母
public class UserSer {
    @Autowired //不需要添加set方法
    @Qualifier(value = "userInterImp")//当该接口有多个实现类时，无法自动找到合适的实现类从而报错，该注解可以通过指定来解决这个问题
    private UserInter userInter;
    //高版本jdk移除了@Resource

    public void add() {
        System.out.println("UserSer");
        userInter.hello();
    }
}
