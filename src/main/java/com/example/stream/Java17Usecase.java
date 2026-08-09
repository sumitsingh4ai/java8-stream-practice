package com.example.stream;

public class Java17Usecase {
    public static void main(String[] args) {

        // Example of using switch expressions in Java 17
        String day = "MONDAY";
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println(day + " is a " + typeOfDay);
    }
}
