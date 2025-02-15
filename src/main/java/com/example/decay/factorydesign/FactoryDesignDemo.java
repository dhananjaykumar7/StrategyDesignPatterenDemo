package com.example.decay.factorydesign;

public class FactoryDesignDemo {
    public static void main(String[] args) {
        Vehical bike=VehicalFactory.getVehical("BIKE");
        bike.manufacture();

    }
}
