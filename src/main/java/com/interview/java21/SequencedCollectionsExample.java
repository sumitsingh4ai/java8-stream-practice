package com.interview.java21;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionsExample {
    public static void main(String[] args) {
        System.out.println("--- Sequenced Collections Example ---");
        
        SequencedCollection<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        list.addFirst("Zero");
        list.addLast("Fourth");

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Reversed order: " + list.reversed());
    }
}
