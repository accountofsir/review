package com.demo.delegate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployC implements IEmployee {


    @Override
    public void doing(String cmd) {
        log.info("C擅长架构, 开始做{}", cmd);
    }
}
