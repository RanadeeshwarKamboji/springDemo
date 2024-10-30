package com.rana.xmlannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!..");

        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

//        Annotation based xml configuration
        Bike bike = context.getBean("bike", Bike.class);
        bike.drive();

//        Usual way
        Tyre tyre = context.getBean("tyre", Tyre.class);
        Car myCar = context.getBean("car", Car.class);
        myCar.setTyre(tyre);
        myCar.drive();

//        Another way using Autowired don't need to pass the tyre value to setter
        Bus bus = context.getBean("bus", Bus.class);
        bus.drive();
    }
}
