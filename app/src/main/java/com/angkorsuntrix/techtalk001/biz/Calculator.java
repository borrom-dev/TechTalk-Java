package com.angkorsuntrix.techtalk001.biz;


import java.util.concurrent.TimeUnit;

public class Calculator {

    public int multiply(int firstOpt, int secondOpt) {
        if (secondOpt == 1) {
            throw new NumberFormatException("Cannot multiply string with number");
        }
        return firstOpt * secondOpt;
    }

    public int getCalculationResult() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1000;
    }
}
