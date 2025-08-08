package com.example.JUnitDemo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    // Create a Logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        // Sample data
        String username = "JohnDoe";
        int age = 28;
        double accountBalance = 1500.75;

        // Using parameterized logging to log the values
        logger.info("User Details: Username={}, Age={}, Account Balance={}", username, age, accountBalance);

        // Log with conditional information
        if (accountBalance > 1000) {
            logger.warn("Account balance is high. User: {} has a balance of: {}", username, accountBalance);
        } else {
            logger.warn("Account balance is low. User: {} has a balance of: {}", username, accountBalance);
        }

        // Simulate an error scenario
        if (age < 18) {
            logger.error("User {} is underage (Age: {}). Cannot process account.", username, age);
        }
    }
}

