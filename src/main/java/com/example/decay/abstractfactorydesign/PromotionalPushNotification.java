package com.example.decay.abstractfactorydesign;

public class PromotionalPushNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending PROMOTIONAL Push Notification: " + message);
        // Logic to send push notification
    }
}