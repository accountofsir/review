package com.demo.singleton.enums;

import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

public class TestDemo {

    public static void main(String[] args) throws Exception {

        Constructor<EnumSingleton> constructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumSingleton bbb = constructor.newInstance("bbb", 1);
        System.out.println(bbb);


    }

    @Test
    public void UnSerial() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(arr);

        out.writeObject(EnumSingleton.INSTANCE);
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(arr.toByteArray()));
        Object o = in.readObject();
        System.out.println(o);

        EnumSingleton aa = Enum.valueOf(EnumSingleton.class, "aa");
        System.out.println(aa);

    }

    @Test
    public void test02() {
        EnumSingleton.INSTANCE.sayHello();
    }
}
