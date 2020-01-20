package com.web.spring.study.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserCRUD {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/di3/applicationConfig.xml");
        UserDAO userDAO = (UserDAO)ctx.getBean("userDAO");
        System.out.println(userDAO.getUsers());
        System.out.println(userDAO.getUser("admin"));
        userDAO.updatePassword("admin", "5678");
        System.out.println(userDAO.getUsers());
        userDAO.deleteUser("admin");
        System.out.println(userDAO.getUsers());
        userDAO.addUser("mary", "9999");
        System.out.println(userDAO.getUsers());
    }
    
}
