package com.example.JUnitDemo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create a Logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        // Log an error message
        logger.error("This is an error message");

        // Log a warning message
        logger.warn("This is a warning message");

        // Log an info message
        logger.info("This is an info message");

        // Log a debug message
        logger.debug("This is a debug message");

        // Log a trace message (usually for detailed debugging)
        logger.trace("This is a trace message");
    }
}
