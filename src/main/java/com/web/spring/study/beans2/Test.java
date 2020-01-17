package com.web.spring.study.beans2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);
        HelloBean helloBean = (HelloBean)ctx.getBean("helloBean");
        System.out.println(helloBean.getName());

    }
}
