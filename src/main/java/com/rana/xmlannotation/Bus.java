package com.rana.xmlannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
//    @Autowired
    private Tyre tyre;
    @Autowired
    public void setTyre(Tyre tyre){
        this.tyre = tyre;
    }

    public Tyre getTyre(){
        return this.tyre;
    }
    @Override
    public void drive() {
        System.out.println("Bus is travelling with "+ tyre);
    }
}
