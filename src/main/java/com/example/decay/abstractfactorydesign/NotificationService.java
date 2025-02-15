package com.example.decay.abstractfactorydesign;

public class NotificationService {
    public static void main(String[] args) {
        // Get Transactional Notification Factory
        NotificationFactory transactionalFactory = NotificationFactoryProducer.getFactory("TRANSACTIONAL");

        Notification email = transactionalFactory.createEmailNotification();
        email.sendNotification("Your order has been shipped.");

        Notification sms = transactionalFactory.createSMSNotification();
        sms.sendNotification("Your OTP is 123456.");

        // Get Promotional Notification Factory
        NotificationFactory promotionalFactory = NotificationFactoryProducer.getFactory("PROMOTIONAL");

        Notification promoEmail = promotionalFactory.createEmailNotification();
        promoEmail.sendNotification("Get 50% off on your next purchase!");

        Notification promoPush = promotionalFactory.createPushNotification();
        promoPush.sendNotification("Limited-time offer on our new collection!");
    }
}