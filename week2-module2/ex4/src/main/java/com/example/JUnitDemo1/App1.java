package com.example.JUnitDemo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1 {

    // Create a Logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // Log messages at different levels
        logger.debug("This is a DEBUG level message");
        logger.info("This is an INFO level message");
        logger.warn("This is a WARN level message");
        logger.error("This is an ERROR level message");

        // Simulating some functionality
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An error occurred: ", e);
        }
    }
}

