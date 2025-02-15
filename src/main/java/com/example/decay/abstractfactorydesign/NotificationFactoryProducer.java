package com.example.decay.abstractfactorydesign;

public class NotificationFactoryProducer {
    public static NotificationFactory getFactory(String type) {
        if (type.equalsIgnoreCase("TRANSACTIONAL")) {
            return new TransactionalNotificationFactory();
        } else if (type.equalsIgnoreCase("PROMOTIONAL")) {
            return new PromotionalNotificationFactory();
        }
        throw new IllegalArgumentException("Unknown Factory Type: " + type);
    }
}