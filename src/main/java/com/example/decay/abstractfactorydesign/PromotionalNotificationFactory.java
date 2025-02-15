package com.example.decay.abstractfactorydesign;

public class PromotionalNotificationFactory implements NotificationFactory {
    @Override
    public Notification createEmailNotification() {
        return new PromotionalEmailNotification();
    }

    @Override
    public Notification createSMSNotification() {
        return new PromotionalSMSNotification();
    }

    @Override
    public Notification createPushNotification() {
        return new PromotionalPushNotification();
    }
}