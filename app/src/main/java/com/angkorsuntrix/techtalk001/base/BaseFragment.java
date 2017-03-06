package com.angkorsuntrix.techtalk001.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

public abstract class BaseFragment<T extends Presenter, C> extends Fragment implements BaseView {

    private T mPresenter;
    private C mComponent;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mComponent = createConfigComponent();

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.attachView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.detachView();
    }

    public C getComponent() {
        return mComponent;
    }

    protected void registerPresenter(T presenter) {
        Log.d("Register presenter", presenter.toString());
        mPresenter = presenter;
    }

    protected T getPresenter() {
        return mPresenter;
    }

    protected abstract C createConfigComponent();

    protected abstract void configurePresenter(T presenter);

}
