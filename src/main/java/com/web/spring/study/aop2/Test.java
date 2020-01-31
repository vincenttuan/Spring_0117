package com.web.spring.study.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/web/spring/study/aop2/applicationConfig.xml");
        Actor actor = (Actor)ctx.getBean("singer");
        actor.show();
    }
}
