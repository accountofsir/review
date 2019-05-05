package com.demo.decorate;

public class BaseBatterCake implements BatterCake {
    @Override
    public String getMsg() {
        return "一个素煎饼";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
