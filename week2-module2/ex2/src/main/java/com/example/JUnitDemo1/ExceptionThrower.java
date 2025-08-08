package com.example.JUnitDemo1;

public class ExceptionThrower {

    public void throwException(boolean shouldThrow) {
        if (shouldThrow) {
            throw new IllegalArgumentException("Expected exception");
        }
    }
}
