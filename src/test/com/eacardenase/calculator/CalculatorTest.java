package com.eacardenase.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero() {
        int result = calculator.add(0, 0);

        assertEquals(0, result, "Was expecting sum of 0");
    }

    @Test
    public void canAddOnePlusOne() {
        int result = calculator.add(1, 1);

        assertEquals(2, result, "Was expecting sum of 0");
    }

    @Test
    public void canAddMinusOnePlusOne() {
        int result = calculator.add(-1, 1);

        assertEquals(0, result, "Was expecting sum of 0");
    }

    @Test
    public void canAddMinusOnePlusMinusOne() {
        int result = calculator.add(-1, -1);

        assertEquals(-2, result, "Was expecting sum of 0");
    }

    @Test
    public void canAddMaxIntPlusOne() {
        int result = calculator.add(Integer.MAX_VALUE, 1);

        assertEquals(Integer.MAX_VALUE + 1L, result);
    }
}
