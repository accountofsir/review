package com.demo.singleton.hunger;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

public class TestDemo {


    public static void main(String[] args) {

        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
        System.out.println(HungerSingleton.getInstance());
    }

    @Test
    public void testReflect() throws Exception {
        System.out.println(HungerSingleton.getInstance());
        HungerSingleton obj = HungerSingleton.getInstance();
        Constructor<HungerSingleton> c = HungerSingleton.class.getDeclaredConstructor();
        c.setAccessible(true);
        HungerSingleton hungerSingleton = c.newInstance();
        System.out.println(hungerSingleton);
    }

    @Test
    public void testUnSerial() throws IOException, ClassNotFoundException {
        System.out.println(HungerSingleton.getInstance());
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        System.out.println(byteArray.size());
        ObjectOutputStream out = new ObjectOutputStream(byteArray);
        System.out.println(byteArray.size());
        out.writeObject(HungerSingleton.getInstance());
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(byteArray.toByteArray()));
        Object o = in.readObject();
        System.out.println(o);
    }
}
