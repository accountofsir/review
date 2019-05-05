package com.demo.delegate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmployB implements IEmployee {


    @Override
    public void doing(String cmd) {
        log.info("B擅长业务, 开始做{}", cmd);
    }
}
