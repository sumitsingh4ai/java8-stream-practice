package com.interview.java17;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello Java 17 Features";

        System.out.println("--- Pattern Matching for instanceof Example ---");
        if (obj instanceof String s) {
            System.out.println("Length of string: " + s.length());
            System.out.println("Uppercase: " + s.toUpperCase());
        }
    }
}
