package com.example.JUnitDemo1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class EvenCheckerTest {

    EvenChecker evenChecker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})  // Provide an array of values to test
    public void testIsEvenWithEvenNumbers(int number) {
        assertTrue(evenChecker.isEven(number));  // Assert that the number is even
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})  // Provide an array of odd numbers
    public void testIsEvenWithOddNumbers(int number) {
        assertFalse(evenChecker.isEven(number));  // Assert that the number is not even
    }
}

