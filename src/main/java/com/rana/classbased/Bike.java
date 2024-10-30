package com.rana.classbased;

import org.springframework.stereotype.Component;
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
