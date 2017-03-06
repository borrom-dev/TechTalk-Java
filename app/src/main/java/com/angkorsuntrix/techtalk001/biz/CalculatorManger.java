package com.angkorsuntrix.techtalk001.biz;

public class CalculatorManger {

    public CalculatorInteractor mInteractor;

    public CalculatorManger(CalculatorInteractor interactor) {
        mInteractor = interactor;
    }

    public int getResult(int firstOpt, int secondOpt) {
        return mInteractor.multiply(firstOpt, secondOpt);
    }

}
