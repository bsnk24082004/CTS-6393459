package com.example.JUnitDemo1;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)  // This orders tests based on @Order
public class OrderedTests {

    @Test
    @Order(1)  // First test to be executed
    public void firstTest() {
        System.out.println("First Test");
    }

    @Test
    @Order(2)  // Second test to be executed
    public void secondTest() {
        System.out.println("Second Test");
    }

    @Test
    @Order(3)  // Third test to be executed
    public void thirdTest() {
        System.out.println("Third Test");
    }
}
