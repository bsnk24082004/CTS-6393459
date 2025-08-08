package com.example.JUnitDemo1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc; // The calculator instance to be tested.

    // Setup: runs before each test
    @Before
    public void setUp() {
        calc = new Calculator();  // Initialize the Calculator before each test
        System.out.println("Setup complete");
    }

    // Teardown: runs after each test
    @After
    public void tearDown() {
        System.out.println("Test finished");
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));  // Test addition method
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));  // Test subtraction method
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));  // Test multiplication method
    }

    @Test
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));  // Test division method
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calc.divide(10, 0);  // This should throw an exception
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(8, result);  // Assert that the result is 8
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calc.subtract(a, b);

        // Assert
        assertEquals(6, result);  // Assert that the result is 6
    }
}
