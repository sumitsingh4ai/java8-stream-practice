package com.interview.java17;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        String day = "FRIDAY";

        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("--- Switch Expressions Example ---");
        System.out.println(day + " is a " + typeOfDay);
    }
}
