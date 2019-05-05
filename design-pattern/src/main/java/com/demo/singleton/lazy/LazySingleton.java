package com.demo.singleton.lazy;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    //防止反射破坏
    private LazySingleton() {
        if (null != lazySingleton) {
            throw new RuntimeException("class has been init....");
        }
    }
    //防止反序列化破坏
    public Object readResolve() {
        return lazySingleton != null ? lazySingleton : new LazySingleton();
    }
    public static LazySingleton getInstance() {
        if (null == lazySingleton) {
            synchronized (LazySingleton.class) {
                if (null == lazySingleton) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
