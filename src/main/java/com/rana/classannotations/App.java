package com.rana.classannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!..");

        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        Travel travel = context.getBean(Travel.class);
        System.out.println(travel);
//        when component and primary are commented we will get Car
//        if not we will get Bike
//        if both car and bike has @component, we can use qualifier in Travel to select the vehicle
//        we can use @Component("component_name") to change name of that component.

    }
}
