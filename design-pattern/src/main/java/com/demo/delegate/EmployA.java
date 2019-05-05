package com.demo.delegate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployA implements IEmployee {
    @Override
    public void doing(String cmd) {
        log.info("A 擅长算法, 开始做{}", cmd);
    }
}
