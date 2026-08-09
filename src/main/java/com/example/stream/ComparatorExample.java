package com.example.stream;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<City> cities = Arrays.asList(
            new City("New York", "NY", "USA"),
            new City("Los Angeles", "CA", "USA"),
            new City("Chicago", "IL", "USA")
        );

        // Sort cities by name
        cities.sort(Comparator.comparing(City::getName));
        System.out.println("Sorted by Name: " + cities);

        // Sort cities by state, then by name
        cities.sort(Comparator.comparing(City::getState).thenComparing(City::getName));
        System.out.println("Sorted by State and Name: " + cities);
    }
}