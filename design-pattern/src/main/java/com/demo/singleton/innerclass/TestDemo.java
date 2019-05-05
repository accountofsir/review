package com.demo.singleton.innerclass;

import com.demo.singleton.lazy.LazySingleton;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println(TestDemo.class.getSimpleName());
    }

    @Test
    public void test01() throws Exception {
        System.out.println(InnerClassSingleton.getInstance());
        System.out.println(InnerClassSingleton.getInstance());
        System.out.println(InnerClassSingleton.getInstance());
        Constructor<InnerClassSingleton> c0 = InnerClassSingleton.class.getDeclaredConstructor();
        c0.setAccessible(true);
        System.out.println("反射："+c0.newInstance());
        System.out.println(InnerClassSingleton.getInstance());
        System.out.println(InnerClassSingleton.getInstance());
        System.out.println(InnerClassSingleton.getInstance());

        Class<?> clazz = Class.forName("com.demo.singleton.innerclass.InnerClassSingleton$SingletonHolder");
        Constructor<?> c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        Object o = c.newInstance();
        System.out.println(InnerClassSingleton.getInstance());
    }
}
