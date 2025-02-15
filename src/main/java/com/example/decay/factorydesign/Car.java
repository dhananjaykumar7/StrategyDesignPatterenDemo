package com.example.decay.factorydesign;

public class Car implements Vehical{
    @Override
    public void manufacture() {
        System.out.println("Car is being manufactured.");
    }
}
