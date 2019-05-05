package com.demo.adapter;

import com.demo.util.Result;

public interface IPassportForThird {

    /**
     * QQ登录
     * @param id
     * @return
     */
    Result loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    Result loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    Result loginForToken(String token);

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    Result loginForTelphone(String telphone, String code);

    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    Result loginForRegist(String username, String passport);
}