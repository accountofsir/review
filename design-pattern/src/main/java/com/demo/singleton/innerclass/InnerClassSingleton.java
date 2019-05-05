package com.demo.singleton.innerclass;

public class InnerClassSingleton {
    private InnerClassSingleton() {
        if (SingletonHolder.SINGLETON != null) {
            throw new RuntimeException("请勿反射操作");
        }
    }
    public static InnerClassSingleton getInstance() {
        return SingletonHolder.SINGLETON;
    }
    private static class SingletonHolder {
        private static final InnerClassSingleton SINGLETON = new InnerClassSingleton();
    }
}
