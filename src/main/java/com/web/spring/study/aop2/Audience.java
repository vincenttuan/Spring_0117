package com.web.spring.study.aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

    @Pointcut(value = "execution(* com.web.spring.study.aop2.Actor.show(..))")
    public void show() {}
    
    @Around("show()")
    public void watchShow(ProceedingJoinPoint jp) {
        try {
            System.out.println("找到座位");
            System.out.println("手機靜音");
            jp.proceed();
            System.out.println("Yes~ 鼓掌!!!");
        } catch (Throwable e) {
            System.out.println("\u001B[31m太爛了 " + e.getMessage() + " ！退票");
        }
    }

}
