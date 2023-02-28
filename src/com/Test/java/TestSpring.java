package com.Test.java;

import com.Spring.java.*;
import com.Spring.java.Config.SpringConfig;
import com.Spring.java.FactoryBean.MyBean;
import com.Spring.java.autowire.Student;
import com.Spring.java.collectiontype.Stu;
import com.Spring.java.collectiontype.Book;
import com.Spring.java.demo.UserSer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testAdd() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    //测试beans1.xml中的set方法注入
    @Test
    public void testBook() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans1.xml");
        //2.获取配置创建的对象
        com.Spring.java.Book book = context.getBean("book", com.Spring.java.Book.class);

        System.out.println(book);
        book.toString();
    }

    //测试beans1.xml中的有参构造注入
    @Test
    public void testOrders() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans1.xml");
        //2.获取配置创建的对象
        Orders order = context.getBean("orders", Orders.class);

        System.out.println(order);
        order.toString();
    }

    //测试外部bean的注入
    @Test
    public void testBeanRef1() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans2.xml");
        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    //测试内部bean的注入
    @Test
    public void testBeanRef2() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans2.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp.toString());
    }

    //测试级联赋值
    @Test
    public void testBeanRef3() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans3.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp.toString());
    }

    //测试集合类型属性的注入
    @Test
    public void testCollectionType1() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans4.xml");
        //2.获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);

        System.out.println(stu.toString());
    }

    //测试提取集合类型后的注入
    @Test
    public void testCollectionType2() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans5.xml");
        //2.获取配置创建的对象
        com.Spring.java.collectiontype.Book book = context.getBean("book", com.Spring.java.collectiontype.Book.class);

        System.out.println(book.toString());
    }

    //测试工厂bean
    @Test
    public void testFactoryBean() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans6.xml");
        //2.获取配置创建的对象(此时返回的类型与bean标签的类型不同)
        Stu stu = context.getBean("mybean", Stu.class);

        System.out.println(stu.toString());
    }

    //测试自动装配
    @Test
    public void testAutoWire() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans6.xml");
        //2.获取配置创建的对象
        Student student = context.getBean("student", Student.class);

        System.out.println(student.toString());
    }

    //测试注解创建对象
    @Test
    public void testService() {
        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans7.xml");
        //2.获取配置创建的对象
        UserSer userSer = context.getBean("userSer", UserSer.class);

        System.out.println(userSer);
        userSer.add();
    }

    //测试完全注解开发
    @Test
    public void testService2() {
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //2.获取配置创建的对象
        UserSer userSer = context.getBean("userSer", UserSer.class);

        System.out.println(userSer);
        userSer.add();
    }
}
