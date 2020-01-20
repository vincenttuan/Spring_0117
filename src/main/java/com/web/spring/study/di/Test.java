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
        
        Family family3 = (Family)ctx.getBean("family3");
        System.out.println(family3);
        
        Family family4 = (Family)ctx.getBean("family4");
        System.out.println(family4);
        
        Family family5 = (Family)ctx.getBean("family5");
        System.out.println(family5);
        
    }
}
