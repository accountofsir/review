package com.demo.adapter.adapters;

import com.demo.util.Result;

public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(LoginInterface obj) {
        return obj instanceof LoginForQQ;
    }

    @Override
    public Result login(String QQNumber, LoginInterface login) {
        LoginForQQ loginForQQ = (LoginForQQ) login;
        return loginForQQ.login(QQNumber);
    }
}
