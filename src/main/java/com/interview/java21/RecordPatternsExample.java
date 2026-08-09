package com.interview.java21;

public class RecordPatternsExample {
    public record Point(int x, int y) {}

    public static void main(String[] args) {
        System.out.println("--- Record Patterns Example ---");
        Object obj = new Point(10, 20);

        // Deconstruct record directly in instanceof
        if (obj instanceof Point(int x, int y)) {
            System.out.println("X coordinate: " + x);
            System.out.println("Y coordinate: " + y);
        }
    }
}
