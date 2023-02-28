package com.Test.java;

import com.Spring.java.AnnoAOP.AnnoTestClass;
import com.Spring.java.TestAOP.JdkProxy;
import com.Spring.java.TestAOP.JdkProxyImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class TestAOPProxy {
    //测试JDK的动态代理
    public static void main(String[] args) {
        Class[] interfaces = {JdkProxy.class};
        JdkProxyImp jdkProxyImp = new JdkProxyImp();
        //用Proxy.newProxyInstance()创建接口代理类的代理对象
        JdkProxy jdkProxy = (JdkProxy)Proxy.newProxyInstance(TestAOPProxy.class.getClassLoader(), interfaces, new Invoca(jdkProxyImp));

        //这里调用被增强类中的任意一个方法，增强部分都会加入
        System.out.println(jdkProxy.add(1, 1));
    }

    //测试基于注解的AOP
    @Test
    public void TestAnnoAOP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/xml/beans7.xml");
        AnnoTestClass annoTestClass = context.getBean("annoTestClass", AnnoTestClass.class);

        annoTestClass.add();
    }
}

class Invoca implements InvocationHandler {
    private Object obj;
    //要增强哪个类(或者要创建哪个类的代理对象)，就把这个类传递过来
    //通过有参构造传递
    public Invoca(Object obj){
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //要增强的方法执行之前的操作
        System.out.println("方法之前执行"+method.getName()+":传递的参数"+ Arrays.toString(args));

        //执行要增强的方法
        Object res = method.invoke(obj, args);

        //此处可以针对不同的方法进行不同的处理
        //用method.getName()获取方法名，确定调用的方法

        //要增强的方法执行之前的操作
        System.out.println("方法之后执行"+obj);

        return res;
    }
}