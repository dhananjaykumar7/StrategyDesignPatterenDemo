package com.example.decay.abstractfactorydesign;

public interface NotificationFactory {
    Notification createEmailNotification();
    Notification createSMSNotification();
    Notification createPushNotification();
}