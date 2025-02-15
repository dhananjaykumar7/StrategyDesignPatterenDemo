package com.example.decay.abstractfactorydesign;

public class PromotionalEmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending PROMOTIONAL Email: " + message);
        // Logic to send email
    }
}