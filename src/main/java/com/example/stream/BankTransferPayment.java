// File: BankTransferPayment.java
package com.example.stream;

public final class BankTransferPayment extends Payment {
    private final String accountNumber;

    public BankTransferPayment(double amount, String accountNumber) {
        super(amount);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}