package com.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "IT", 70000),
            new Employee("David", "HR", 55000)
        );

        // Filter employees with salary > 55000
        List<Employee> highEarners = employees.stream()
            .filter(a -> a.getSalary() > 55000)
            .collect(Collectors.toList());

        System.out.println("High Earners: " + highEarners);

        // Group employees by department
        Map<String, List<Employee>> groupedByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Grouped by Department: " + groupedByDepartment);
    }
}