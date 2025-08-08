package com.example.JUnitDemo1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTesterTest {

    PerformanceTester performanceTester = new PerformanceTester();

    @Test
    public void testPerformance() {
        assertTrue(true);
    }
    @Test(timeout = 200)  // Timeout of 200ms
    public void testPerformTaskWithinTimeLimit() {
        performanceTester.performTask();  // The task should complete within 200ms
    }

    @Test(timeout = 50)  // Timeout of 50ms
    public void testPerformTaskTooLong() {
        performanceTester.performTask();  // This will fail since the task takes 100ms
    }
}