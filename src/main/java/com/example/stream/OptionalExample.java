package com.example.stream;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalName = Optional.ofNullable(getName());

        // Check if value is present
        optionalName.ifPresent(name -> System.out.println("Name: " + name));

        // Provide a default value
        String defaultName = optionalName.orElse("Default Name");
        System.out.println("Default Name: " + defaultName);

        // Throw an exception if value is not present
        optionalName.orElseThrow(() -> new IllegalArgumentException("Name is missing!"));
    }

    private static String getName() {
        return null; // Simulate a null value
    }
}