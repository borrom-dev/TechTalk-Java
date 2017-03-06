package com.angkorsuntrix.techtalk001.sampleTest;


import com.angkorsuntrix.techtalk001.biz.Calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void multiplicationOfZeroInterShouldReturnZero() {
        Calculator calculator = new Calculator();
        assertEquals("10 x 0 must be 0", 0, calculator.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, calculator.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, calculator.multiply(0, 0));
    }

    @Test
    public void multiplicationOfStringShouldReturnError() {
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("Cannot multiply");
        Calculator calculator = new Calculator();
        calculator.multiply(10, 1);
    }

    @Test(timeout = 1000)
    public void getCalculationResult() {
        Calculator calculator = new Calculator();
        calculator.getCalculationResult();
    }
}
