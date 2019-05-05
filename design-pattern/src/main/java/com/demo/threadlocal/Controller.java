package com.demo.threadlocal;

public class Controller {

    public void update(String v) {
        Holder.set(v);

    }
}
