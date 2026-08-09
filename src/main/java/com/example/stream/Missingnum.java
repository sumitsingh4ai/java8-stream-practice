package com.example.stream;

public class Missingnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6};
        int n = arr.length + 1; // Total number of elements including the missing one
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
