package com.angkorsuntrix.techtalk001.base;

public interface Presenter<T extends BaseView> {
    void attachView(T view);

    void detachView();
}
