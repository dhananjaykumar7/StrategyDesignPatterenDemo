package com.example.decay.proxydesign;

import java.util.HashMap;
import java.util.Map;

public class ProductServiceProxy implements ProductService{
    private RealProductService realProductService;
    private Map<Integer, String> cache = new HashMap<>();
    @Override
    public String getProductDetails(int productId) {
        if (cache.containsKey(productId)) {
            System.out.println("Returning cached product details for Product ID: " + productId);
            return cache.get(productId);
        }
        // Lazy initialization of RealProductService
        if (realProductService == null) {
            realProductService = new RealProductService();
        }


        // Fetch from database and store in cache
        String productDetails = realProductService.getProductDetails(productId);
        cache.put(productId, productDetails);
        return productDetails;
    }
}
