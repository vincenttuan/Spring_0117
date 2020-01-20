package com.web.spring.study.di3;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/di3/applicationConfig.xml");
        UserDAO userDAO = (UserDAO)ctx.getBean("userDAO");
        System.out.println(userDAO);
        System.out.println(userDAO.getUsers());
        
        Login login = (Login)ctx.getBean("login");
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入 username: ");
        String username = sc.next();
        System.out.println("請輸入 passwprd: ");
        String passwprd = sc.next();
        System.out.println("Login: " + login.check(username, passwprd));
    }
}
