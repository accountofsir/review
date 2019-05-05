package com.demo.decorate;

public class BatterCakeDecorate implements BatterCake {
    private BatterCake batterCake;
    public BatterCakeDecorate(BatterCake batterCake) {
        this.batterCake = batterCake;
    }
    @Override
    public String getMsg() {
        return batterCake.getMsg();
    }
    @Override
    public double getPrice() {
        return batterCake.getPrice();
    }
}
