package com.example.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCountExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Count frequency of each word
        Map<String, Long> frequencyMap = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Word Frequency: " + frequencyMap);
    }
}