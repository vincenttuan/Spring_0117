package com.web.spring.study.aop2;

import org.springframework.stereotype.Component;

@Component
public class Dancer implements Actor {

    @Override
    public void show() {
        try {
            System.out.println("跳舞");
            Thread.sleep(1000);
            System.out.println("跳舞");
            Thread.sleep(1000);
            System.out.println("跳舞");
        } catch (Exception e) {
        }
    }
    
}
