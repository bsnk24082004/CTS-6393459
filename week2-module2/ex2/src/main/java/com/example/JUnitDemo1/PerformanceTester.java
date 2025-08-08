package com.example.JUnitDemo1;


public class PerformanceTester {

    public void performTask() {
        try {
            Thread.sleep(100);  // Simulate a task that takes 100ms to complete
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
