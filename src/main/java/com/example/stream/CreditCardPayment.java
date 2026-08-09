// File: CreditCardPayment.java
package com.example.stream;

public final class CreditCardPayment extends Payment {
    private final String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}