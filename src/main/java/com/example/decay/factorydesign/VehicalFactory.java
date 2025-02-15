package com.example.decay.factorydesign;

public class VehicalFactory {
    public static Vehical getVehical(String vehicalType){
        if(vehicalType==null){
            return null;
        }
        if(vehicalType.equalsIgnoreCase("BIKE")){
            return new Bike();
        }
        if(vehicalType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        return null;

    }
}
