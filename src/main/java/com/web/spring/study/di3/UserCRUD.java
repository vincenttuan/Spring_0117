package com.web.spring.study.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserCRUD {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/di3/applicationConfig.xml");
        UserDAO userDAO = (UserDAO)ctx.getBean("userDAO");
        userDAO.updatePassword("admin", "5678");
        System.out.println(userDAO.getUsers());
    }
    
}
