package com.web.spring.study.di2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/di2/applicationConfig.xml");
        Family family = (Family)ctx.getBean("family");
        System.out.println(family);
        
    }
}
