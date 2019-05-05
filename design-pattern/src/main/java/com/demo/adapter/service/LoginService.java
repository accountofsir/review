package com.demo.adapter.service;

import com.demo.util.Result;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginService {

    public Result login() {
        log.info("老代码login");
        return Result.getResult(Result.SUCCESS, "ok");
    }

    public Result register(String username, String passwd) {
        log.info("注册成功!");
        return Result.getResult(Result.SUCCESS, "ok");
    }
}
