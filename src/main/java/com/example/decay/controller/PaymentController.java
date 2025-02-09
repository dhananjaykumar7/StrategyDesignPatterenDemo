package com.example.decay.controller;

import com.example.decay.model.PaymentMode;
import com.example.decay.service.PaymentExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PaymentController {

    @Autowired
    private PaymentExecutor paymentExecutor;

    @PostMapping("/pay")
    public String placeOrder(@RequestParam PaymentMode paymentMode,
                           @RequestParam double amount){
        return paymentExecutor.processPayment(paymentMode,amount);
    }
}