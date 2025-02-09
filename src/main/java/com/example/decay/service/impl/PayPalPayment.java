package com.example.decay.service.impl;

import com.example.decay.model.PaymentMode;
import com.example.decay.service.PaymentStrategy;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import static com.example.decay.service.impl.PaymentExecutorImpl.addPaymentStrategy;

@Service
public class PayPalPayment implements PaymentStrategy {
    @PostConstruct
    @Override
    public void register() {

        addPaymentStrategy(PaymentMode.PAYPAL,this);
    }
    @Override
    public String execute(double amount) {

        return "Amount paid via PayPal: "+amount;
    }
}