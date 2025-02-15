package com.example.decay.proxydesign;

public class RealProductService implements ProductService {
    @Override
    public String getProductDetails(int productId) {
        // Simulate slow DB call
        System.out.println("Fetching product details from Database for Product ID: " + productId);
        return "Product Details for Product ID: " + productId;
    }
}