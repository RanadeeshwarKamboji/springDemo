package com.rana.xmlannotation;

public class Tyre {
    private String brand;
    private String vehicle;

    public Tyre(){

    }

    public Tyre(String brand){
        this.brand = brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setVehicle(String vehicle){
        this.vehicle = vehicle;
    }

    public String getVehicle(){
        return this.vehicle;
    }

    @Override
    public String toString(){
        return "Tyre[Brand: " + this.brand + ", Vehicle: " + this.vehicle +"]";
    }
}
