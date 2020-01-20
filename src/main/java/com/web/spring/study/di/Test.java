package com.web.spring.study.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/di/applicationConfig.xml");
        Family family = (Family)ctx.getBean("family");
        System.out.println(family);
        
        Family family2 = (Family)ctx.getBean("family2");
        System.out.println(family2);
        
    }
}
