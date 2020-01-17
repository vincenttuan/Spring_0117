package com.web.spring.study.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/beans/beans-config.xml");
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
        HelloBean helloBean = (HelloBean)ctx.getBean("helloBean");
        System.out.println(helloBean.getName());
        
        HelloBean helloBean2 = ctx.getBean(HelloBean.class);
        System.out.println(helloBean2.getName());

    }
}
