package com.rana.classannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Travel {
    private Vehicle vehicle;

//    public Travel(Vehicle vehicle){
//        this.vehicle = vehicle;
//    }
    @Autowired
    @Qualifier("myBike")
////    @Qualifier("car")
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle(){
        return  this.vehicle;
    }

    @Override
    public String toString() {
        return "Travelling By " + this.vehicle;
    }
}
