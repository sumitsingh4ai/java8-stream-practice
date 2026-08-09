package com.interview.java17;

public class TextBlocksExample {
    public static void main(String[] args) {
        String json = """
                {
                    "language": "Java",
                    "version": 17,
                    "type": "LTS"
                }
                """;
        System.out.println("--- Text Block Example ---");
        System.out.println(json);
    }
}
