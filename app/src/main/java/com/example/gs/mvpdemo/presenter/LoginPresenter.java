package com.example.gs.mvpdemo.presenter;

import com.example.gs.mvpdemo.activity.LoginActivity;
import com.example.gs.mvpdemo.base.BasePresenter;
import com.example.gs.mvpdemo.contract.LoginContract;
import com.example.gs.mvpdemo.model.LoginModel;

/**
 * Created by GaoSheng on 2016/11/26.
 * 20:51
 *
 * @VERSION V1.4
 * com.example.gs.mvpdemo.presenter
 */

public class LoginPresenter extends BasePresenter<LoginModel, LoginActivity> implements
        LoginContract.LoginPresenter {

    @Override
    public void login(String name, String pwd) {
        if (!getIView().checkNull()) {
            if (getiModel().login(name, pwd)) {
                getIView().loginSuccess();
            } else {
                getIView().loginFail("密码或者账号不对");
            }
        }
    }

    @Override
    public LoginModel loadModel() {
        return new LoginModel();
    }
}
