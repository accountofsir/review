package com.demo.threadlocal;

public class DemoTest {

    public static void main(String[] args) throws InterruptedException {
        Controller controller = new Controller();
        controller.update("sir");
        Thread thread = Thread.currentThread();
        Holder.reset();
        Runtime.getRuntime().gc();

        Thread.sleep(5000);
        new Service().update();
    }
}
