package com.web.mvc.beans;

public class User {
    private String name;
    private String age;
    private Num num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Num getNum() {
        return num;
    }

    public void setNum(Num num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + ", num=" + num + '}';
    }
    
}
