package com.demo.singleton.hunger;

import java.io.Serializable;

public class HungerSingleton implements Serializable {

    private static final HungerSingleton INSTANCE = new HungerSingleton();

    private HungerSingleton() {
        if (INSTANCE != null) {
            throw new RuntimeException("已被实例化...");
        }
    }

    public static HungerSingleton getInstance() {
        return INSTANCE;
    }

    public Object readResolve() {
        return INSTANCE;
    }


}
