package com.demo.singleton.enums;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum EnumSingleton {
    INSTANCE;

    public void sayHello() {
        log.info("hello world...");
    }
}
