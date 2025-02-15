package com.example.decay.abstractfactorydesign;

public class PromotionalSMSNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending PROMOTIONAL SMS: " + message);
        // Logic to send SMS
    }
}