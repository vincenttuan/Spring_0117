package com.web.spring.study.beans3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/beans3/applicationConfig.xml");
        HelloBean helloBean = (HelloBean)ctx.getBean("helloBean");
        System.out.println(helloBean.getName());
        
    }
}
