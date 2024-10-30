package com.rana.classbased;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {


    @Bean
    public Vehicle getVehicle(){
        return new Bike();
    }


    @Bean(name = "Bike2")
    public Vehicle getVehicle2(){
        return new Bike();
    }

    @Bean
    public Vehicle getVehicle3(){
        return new Car();
    }
    @Bean
    public Travel startTravel(){
        Travel travel = new Travel();
        travel.setVehicle(getVehicle());
        return travel;
    }

    @Bean
    @Primary
    public Travel startTravel2(@Qualifier("Bike2") Vehicle getVehicle3){
        Travel travel = new Travel();
        travel.setVehicle(getVehicle3);
        return travel;
    }
}


