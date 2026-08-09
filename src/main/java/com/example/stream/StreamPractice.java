package com.example.stream;

        import java.util.*;
        import java.util.function.Function;
        import java.util.stream.Collectors;

        public class StreamPractice {
            public static void main(String[] args) {
                List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "David");
                List<String> filtered = names.stream()
                        .filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList());
                System.out.println("Names starting with A: " + filtered);

            }
        }