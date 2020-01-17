package com.web.spring.study.beans2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Wife {
    
    @Value("Joanna")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" + "name=" + name + '}';
    }
    
}
