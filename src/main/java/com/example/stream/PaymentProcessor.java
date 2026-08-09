// File: PaymentProcessor.java
package com.example.stream;

public class PaymentProcessor {
    public static void processPayment(Payment payment) {
        String result = switch (payment) {
            case CreditCardPayment creditCard -> 
                "Processing credit card payment of $" + creditCard.getAmount() + " for card: " + creditCard.getCardNumber();
            case PayPalPayment payPal -> 
                "Processing PayPal payment of $" + payPal.getAmount() + " for email: " + payPal.getEmail();
            case BankTransferPayment bankTransfer -> 
                "Processing bank transfer payment of $" + bankTransfer.getAmount() + " for account: " + bankTransfer.getAccountNumber();
            default -> throw new IllegalStateException("Unexpected value: " + payment);
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(100.0, "1234-5678-9876-5432");
        Payment payment2 = new PayPalPayment(200.0, "user@example.com");
        Payment payment3 = new BankTransferPayment(300.0, "987654321");

        processPayment(payment1);
        processPayment(payment2);
        processPayment(payment3);
    }
}