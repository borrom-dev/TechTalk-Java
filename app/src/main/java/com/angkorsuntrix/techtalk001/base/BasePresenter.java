package com.angkorsuntrix.techtalk001.base;

public abstract class BasePresenter<T extends BaseView> implements Presenter<T> {

    private T mView;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    public T getView() {
        return mView;
    }

}
