package com.example.decay.abstractfactorydesign;

public class TransactionalNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new TransactionalEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new TransactionalSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new TransactionalPushNotification();
    }
}