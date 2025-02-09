package com.example.decay.service;

import com.example.decay.model.PaymentMode;
import org.springframework.stereotype.Service;

@Service
public interface PaymentExecutor {

    String processPayment(PaymentMode paymentMode, double amount) ;
}