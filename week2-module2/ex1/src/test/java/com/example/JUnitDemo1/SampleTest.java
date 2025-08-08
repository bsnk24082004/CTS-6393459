package com.example.JUnitDemo1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void testSum() {
        assertEquals(4, 2 + 2);
    }
}