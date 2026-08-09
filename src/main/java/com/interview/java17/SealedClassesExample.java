package com.interview.java17;

sealed interface Shape permits Circle, Square {}

final class Circle implements Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }
}

final class Square implements Shape {
    private final double side;
    public Square(double side) { this.side = side; }
    public double getSide() { return side; }
}

public class SealedClassesExample {
    public static void main(String[] args) {
        Shape shape = new Circle(5.0);
        System.out.println("--- Sealed Class Example ---");
        System.out.println("Shape type: " + shape.getClass().getSimpleName());
    }
}
