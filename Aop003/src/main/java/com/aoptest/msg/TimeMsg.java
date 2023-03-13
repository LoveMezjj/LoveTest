package com.aoptest.msg;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Aspect //告诉Spring这是一个切面
public class TimeMsg {
//    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.*(..))")
//    private void ff1(){};

    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.ff1())")
    private void ff1(){};
    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.ff2())")
    private void ff2(){};
    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.ff3())")
    private void ff3(){};
    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.ff4())")
    private void ff4(){};
    @Pointcut("execution(* com.aoptest.service.impl.UserServiceImpl.ff5())")
    private void ff5(){};

    @Before("ff1()")//前置通知
    public void msg1(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS");
        String datetime= now.format(dt);
        System.out.println(datetime);
    }

    @After("ff2()")//后置通知
    public void msg2(){
        System.out.println("这是一个后置通知");
    }

    @Around("ff3()")//环绕通知
    public Object msg3(ProceedingJoinPoint proint) throws Throwable {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS");
        String datetime= now.format(dt);
        System.out.println(datetime);
        Object obj=proint.proceed();
        System.out.println(datetime);
        return obj;
    }

    @AfterThrowing("ff5()")//异常通知
    public void msg5(){
        System.out.println("这是一个异常通知");
    }

    @AfterReturning("ff4()")//返回通知
    public void msg4(){
        System.out.println("这是一个返回通知");
    }


}
