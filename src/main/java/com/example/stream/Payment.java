// File: Payment.java
package com.example.stream;
public sealed class Payment permits CreditCardPayment, PayPalPayment, BankTransferPayment {
    private final double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}