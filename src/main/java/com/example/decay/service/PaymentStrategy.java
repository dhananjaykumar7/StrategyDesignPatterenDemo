package com.example.decay.service;

public interface PaymentStrategy {

    void register();
    String execute(double amount);
}