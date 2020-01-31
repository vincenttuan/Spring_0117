package com.web.spring.study.aop2;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class Singer implements Actor {

    @Override
    public void show() {
        try {
            System.out.println("唱歌");
            Thread.sleep(1000);
            System.out.println("唱歌");
            Thread.sleep(1000);
            System.out.println("唱歌");
        } catch (Exception e) {
        }
        int score = new Random().nextInt(100);
        System.out.println("score: " + score);
        if (score < 60) {
            throw new RuntimeException("走音了...");
        }
    }

}
