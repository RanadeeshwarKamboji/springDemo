package com.rana.classbased;

import org.springframework.stereotype.Component;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car is travelling...");
    }

    @Override
    public String toString(){
        return "Car";
    }


}
