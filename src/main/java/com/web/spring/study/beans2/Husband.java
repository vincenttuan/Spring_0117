package com.web.spring.study.beans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Husband {
    
    @Value("John")
    private String name;
    
    @Autowired
    private Wife wife;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" + "name=" + name + ", wife=" + wife + '}';
    }
    
    
}
