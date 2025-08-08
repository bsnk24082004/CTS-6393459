package com.example.JUnitDemo1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        EvenCheckerTest.class,
        PerformanceTesterTest.class
})
public class AllTests {
    // This will run all the tests from EvenCheckerTest and PerformanceTesterTest
}

