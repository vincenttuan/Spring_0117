package com.web.spring.study.aop;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String name;

    public String getName() {
        System.out.println("getName() 做完了");
        return "Hello, " + name;
    }

    public void setName(String name) {
        System.out.println("setName() 做完了");
        this.name = name;
    }
    
}
