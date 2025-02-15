package com.example.decay.streamcomplexop;

public class Customer {
    private String name;
    private int totalSpend;
    private String email;
    Customer(String name,int totalSpend,String email){
        this.name=name;
        this.totalSpend=totalSpend;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSpend() {
        return totalSpend;
    }

    public void setTotalSpend(int totalSpend) {
        this.totalSpend = totalSpend;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
