package com.demo.strategy;

import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class TestDemo {

    public static void main(String[] args) {

        Order order = new Order("0001", "201901010000000001000", 99.99);
        Order order1 = new Order("0002", "201901010000000001001", 88.88);
        order.order(PayMethod.ALiPay);
        order1.order(PayMethod.JDPay);
    }




    @Test
    public void test02() throws IOException {
        Enumeration<URL> resources = ClassLoader.getSystemResources("");
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            url.getFile();
        }
    }
}
