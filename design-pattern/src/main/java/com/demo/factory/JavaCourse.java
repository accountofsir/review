package com.demo.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaCourse implements ICourse {
    public void startStudy(){
        log.info("study java!");
    }
}
