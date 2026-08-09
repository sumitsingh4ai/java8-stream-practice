package com.interview.java17;

public record User(String name, int age) {
    // Compact constructor validation
    public User {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

class RecordExample {
    public static void main(String[] args) {
        User user = new User("Alice", 28);
        System.out.println("--- Record Example ---");
        System.out.println("User name: " + user.name());
        System.out.println("User toString: " + user);
    }
}
