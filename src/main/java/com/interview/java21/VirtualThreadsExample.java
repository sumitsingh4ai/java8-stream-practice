package com.interview.java21;

public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- Virtual Threads Example ---");
        
        // Launch a lightweight Virtual Thread
        Thread vThread = Thread.ofVirtual().start(() -> {
            System.out.println("Running in virtual thread: " + Thread.currentThread());
        });
        
        vThread.join();
    }
}
