package com.example.decay.abstractfactorydesign;

public class TransactionalSMSNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending TRANSACTIONAL Sms: " + message);
    }
}
