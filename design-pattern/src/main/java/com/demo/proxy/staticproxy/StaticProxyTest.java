package com.demo.proxy.staticproxy;

public class StaticProxyTest {

    public static void main(String[] args) {

        Son son = new Son();
        Father father = new Father(son);
        father.findLove();
    }
}
