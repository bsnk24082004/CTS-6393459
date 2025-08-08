package com.example.JUnitDemo1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionThrowerTest {

    ExceptionThrower exceptionThrower = new ExceptionThrower();

    @Test(expected = IllegalArgumentException.class)
    public void testThrowException() {
        exceptionThrower.throwException(true);  // This should throw the exception
    }

    @Test
    public void testNoException() {
        exceptionThrower.throwException(false);  // This should not throw any exception
    }
}