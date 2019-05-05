package com.demo.threadlocal;

public class Service {

    public void update() {
        System.out.println(Holder.get());
    }
}
