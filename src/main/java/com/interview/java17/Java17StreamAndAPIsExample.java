package com.interview.java17;

import java.util.List;
import java.util.stream.Stream;

public class Java17StreamAndAPIsExample {
    public static void main(String[] args) {
        System.out.println("--- Stream.toList() Example ---");
        
        // Java 16/17 direct Stream.toList() returning unmodifiable list
        List<String> fruits = Stream.of("Apple", "Banana", "Cherry")
                .map(String::toUpperCase)
                .toList();

        fruits.forEach(System.out.println);
    }
}
