package com.web.spring.study.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Introducer {

    @DeclareParents(value = "com.web.spring.study.aop2.Actor+",
            defaultImpl = TalkerImpl.class)
    public static Talker talk;
    
}
