package com.Spring.java.AnnoAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //生成代理对象
@Order(2)
public class AnnoTestProxy {

    //公共切入点抽取
    @Pointcut(value = "execution(* com.Spring.java.AnnoAOP.AnnoTestClass.add(..))")
    public void publicPoint() {

    }

    //前置通知
    @Before(value = "publicPoint()")
    public void before() {
        System.out.println("before...");
    }

    //最终通知
    @After(value = "execution(* com.Spring.java.AnnoAOP.AnnoTestClass.add(..))")
    public void after() {
        System.out.println("after...");
    }

    //后置通知
    @AfterReturning(value = "execution(* com.Spring.java.AnnoAOP.AnnoTestClass.add(..))")
    public void afterReturning() {
        System.out.println("after returning...");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.Spring.java.AnnoAOP.AnnoTestClass.add(..))")
    public void afterThrowing() {
        System.out.println("after throwing...");
    }

    //环绕通知
    @Around(value = "execution(* com.Spring.java.AnnoAOP.AnnoTestClass.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //方法执行之前的增强部分
        System.out.println("around before...");
        //方法执行
        proceedingJoinPoint.proceed();
        //方法执行之后的增强部分
        System.out.println("around after...");
    }
}
