package com.rana.classbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!..");

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Travel travel = context.getBean(Travel.class);
        System.out.println(travel);
    }
}
