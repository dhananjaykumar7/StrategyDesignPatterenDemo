package com.example.decay.service.impl;

import com.example.decay.model.PaymentMode;
import com.example.decay.service.PaymentExecutor;
import com.example.decay.service.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class PaymentExecutorImpl implements PaymentExecutor {

    private static HashMap<PaymentMode, PaymentStrategy> paymentStrategyMap = new HashMap<>();

    public static void addPaymentStrategy(PaymentMode paymentMode, PaymentStrategy paymentStrategy){
        paymentStrategyMap.put(paymentMode,paymentStrategy);
    }
    @Override
    public String processPayment(PaymentMode paymentMode, double amount) {
        paymentStrategyMap.get(paymentMode).execute(amount);
        return "";
    }
}
