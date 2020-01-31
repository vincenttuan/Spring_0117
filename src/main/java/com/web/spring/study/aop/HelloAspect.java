package com.web.spring.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloAspect {
    
    @Before(value = "execution(* com.web.spring.study.aop.Hello.setName(..))")
    public void before(JoinPoint jo) throws Throwable {
        System.out.print("AOP Before 攔截 ");
        System.out.println(jo.getTarget().getClass().getName() + "." + jo.getSignature().getName());
    }
    
    @After(value = "execution(* com.web.spring.study.aop.Hello.getName(..))")
    public void after(JoinPoint jo) throws Throwable {
        System.out.print("AOP After 攔截 ");
        System.out.println(jo.getTarget().getClass().getName() + "." + jo.getSignature().getName());
    }
    
    
}
