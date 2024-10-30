package com.rana.xmlannotation;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    private Tyre tyre;

    public void setTyre(Tyre t){
        this.tyre = t;
    }

    public Tyre getTyre(){
        return this.tyre;
    }
    @Override
    public void drive() {
        System.out.println("Car is travelling with " + tyre);
    }


}
