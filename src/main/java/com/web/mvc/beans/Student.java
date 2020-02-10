package com.web.mvc.beans;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
