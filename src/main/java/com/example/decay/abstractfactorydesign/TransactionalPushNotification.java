package com.example.decay.abstractfactorydesign;

public class TransactionalPushNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending TRANSACTIONAL Push Notification: " + message);
        // Logic to send push notification (Firebase, OneSignal, etc.)
    }
}