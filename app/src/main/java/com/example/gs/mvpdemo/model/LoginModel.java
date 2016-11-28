package com.example.gs.mvpdemo.model;

import com.example.gs.mvpdemo.mvp.IModel;

/**
 * Created by GaoSheng on 2016/11/26.
 * 20:53
 *
 * @VERSION V1.4
 * com.example.gs.mvpdemo.model
 * 主要做一些数据处理呀,网路请求呀
 */

public class LoginModel implements IModel {

    public boolean login(String username, String pwd) {
        boolean isLogin = false;
        if ("gs".equals(username) && "123".equals(pwd)) {
            isLogin = true;
        } else {
            isLogin = false;
        }
        return isLogin;
    }
}
