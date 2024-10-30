package com.rana.classannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("myBike")
//@Primary
public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Bike is running....");
    }


    @Override
    public String toString(){
        return "Bike";
    }
}
