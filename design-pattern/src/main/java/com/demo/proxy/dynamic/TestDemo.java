package com.demo.proxy.dynamic;

import com.demo.proxy.staticproxy.Person;
import com.demo.proxy.staticproxy.Son;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import javax.jws.Oneway;
import java.io.FileOutputStream;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

public class TestDemo {
    public static void main(String[] args) {


        Son son = new Son();


        Person o = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, new InvocationHandlerImpl(son));

        o.findLove();
    }

    @Test
    public void test01() throws Exception {
        int i = Modifier.PUBLIC | Modifier.FINAL;
        System.out.println(Modifier.PRIVATE);
        System.out.println(i);
        byte[] bys = ProxyGenerator.generateProxyClass("A", new Class[]{Person.class}, i);

        FileOutputStream out = new FileOutputStream("A.class");
        out.write(bys);
        out.flush();
        out.close();
    }
}
