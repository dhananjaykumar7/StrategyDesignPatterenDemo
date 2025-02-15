package com.example.decay.abstractfactorydesign;

public class TransactionalEmailNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending TRANSACTIONAL Email: " + message);
    }
}
