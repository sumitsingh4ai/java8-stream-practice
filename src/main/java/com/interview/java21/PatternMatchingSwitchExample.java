package com.interview.java21;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        System.out.println("--- Pattern Matching for Switch Example ---");
        System.out.println(formatValue("Java 21"));
        System.out.println(formatValue(100));
        System.out.println(formatValue(null));
    }

    public static String formatValue(Object obj) {
        return switch (obj) {
            case null -> "Null value received";
            case Integer i when i > 50 -> "Large Integer: " + i;
            case Integer i -> "Small Integer: " + i;
            case String s -> "String of length: " + s.length();
            default -> "Unknown type: " + obj.toString();
        };
    }
}
