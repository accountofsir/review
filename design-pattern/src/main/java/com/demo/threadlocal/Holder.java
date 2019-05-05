package com.demo.threadlocal;

public class Holder {

    private static ThreadLocal<String> local = new ThreadLocal();

    public static void set(String v) {
        local.set(v);
    }

    public static String get() {
        return local.get();
    }

    public static void reset() {
        local = null;

    }
}
