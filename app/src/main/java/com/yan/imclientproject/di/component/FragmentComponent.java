package com.yan.imclientproject.di.component;

import com.yan.imclientproject.app.BaseFragment;
import com.yan.imclientproject.di.scope.PerFragment;
import com.yan.imclientproject.ui.login.FragmentLogin;

import dagger.Component;

/**
 * Created by Administrator on 2016/7/19.
 */
@PerFragment
@Component(dependencies = AppComponent.class)
public interface FragmentComponent {
    void inject(BaseFragment baseFragment);
    void inject(FragmentLogin fragmentLogin);
}
