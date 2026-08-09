// File: PayPalPayment.java
package com.example.stream;

public final class PayPalPayment extends Payment {
    private final String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}