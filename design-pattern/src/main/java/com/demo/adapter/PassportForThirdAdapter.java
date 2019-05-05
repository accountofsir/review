package com.demo.adapter;

import com.demo.adapter.service.LoginService;
import com.demo.util.Result;

public class PassportForThirdAdapter extends LoginService implements IPassportForThird {

    @Override
    public Result loginForQQ(String id) {

        return null;
    }

    @Override
    public Result loginForWechat(String id) {
        return null;
    }

    @Override
    public Result loginForToken(String token) {
        return null;
    }

    @Override
    public Result loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public Result loginForRegist(String username, String passport) {
        return null;
    }
}
