package com.angkorsuntrix.techtalk001.sampleTest;

import com.angkorsuntrix.techtalk001.biz.CalculatorInteractor;
import com.angkorsuntrix.techtalk001.biz.CalculatorManger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorMockTest {

    @Mock
    CalculatorInteractor mInteractor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void multiplicationTest() {
        when(mInteractor.multiply(10, 10)).thenReturn(10000);
        CalculatorManger manger = new CalculatorManger(mInteractor);
        manger.getResult(10, 10);
        verify(mInteractor, times(1)).multiply(10, 10);
    }

    @Test
    public void multiplicationOfZeroInterShouldReturnZero() {
        when(mInteractor.multiply(10, 0)).thenReturn(0);
        CalculatorManger manger = new CalculatorManger(mInteractor);
        manger.getResult(10, 0);
        verify(mInteractor, times(1)).multiply(10, 0);
        Assert.assertEquals("Should return 0", 0, mInteractor.multiply(10, 0));
    }


}
