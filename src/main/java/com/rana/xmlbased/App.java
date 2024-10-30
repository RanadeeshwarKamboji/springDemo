package com.rana.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Usual way
        Vehicle vehicle = new Car();
        vehicle.drive();

//        using xml beans
//        vehicle2 -> interface reference
        Vehicle vehicle2 = (Vehicle) context.getBean("vehicle");
//        vehicle3 -> Bice.class reference
        Bike vehicle3 = context.getBean("vehicle", Bike.class);
        vehicle2.drive();
        vehicle3.drive();

//        Passing constructor parameters and setter parameters
        Tyre tyre = context.getBean("tyre", Tyre.class);
        System.out.println(tyre);
    }
}
