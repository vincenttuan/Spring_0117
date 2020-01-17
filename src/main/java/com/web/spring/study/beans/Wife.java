package com.web.spring.study.beans;

public class Wife {
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
