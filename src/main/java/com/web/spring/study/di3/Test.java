package com.web.spring.study.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/di3/applicationConfig.xml");
        UserDAO userDAO = (UserDAO)ctx.getBean("userDAO");
        System.out.println(userDAO);
        System.out.println(userDAO.getUsers());
        
    }
}
