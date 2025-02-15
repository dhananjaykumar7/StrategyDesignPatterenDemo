package com.example.decay.proxydesign;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductServiceProxy();

        // First call - Fetch from DB
        System.out.println(productService.getProductDetails(101));

        // Second call - Fetch from cache
        System.out.println(productService.getProductDetails(101));

        // Another product - Fetch from DB
        System.out.println(productService.getProductDetails(102));

        // Fetch again - Should come from cache
        System.out.println(productService.getProductDetails(102));
    }
}