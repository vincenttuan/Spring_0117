package com.web.spring.study.aop;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String name;

    public String getName() {
        return "Hello, " + name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
