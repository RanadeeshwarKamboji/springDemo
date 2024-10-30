package com.rana.classbased;

import com.rana.classbased.Vehicle;

public class Travel {
    private Vehicle vehicle;

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
