package com.example.test_jenkins;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        assertEquals(5, calculator.sum(2, 3));
    }
}
