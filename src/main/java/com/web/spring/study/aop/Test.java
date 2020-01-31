package com.web.spring.study.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/aop/applicationConfig.xml");
        Hello hello = (Hello)ctx.getBean("hello");
        hello.setName("Java");
        System.out.println(hello.getName());
    }
}
