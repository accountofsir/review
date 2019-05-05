package com.demo.delegate;

public class TestDemo {

    public static void main(String[] args) {
        new Boss().startGan("算法",new Leader(new EmployA()));
    }
}
