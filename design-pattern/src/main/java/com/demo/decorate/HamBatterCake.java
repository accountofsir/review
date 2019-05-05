package com.demo.decorate;

public class HamBatterCake extends BatterCakeDecorate {
    public HamBatterCake(BatterCake batterCake) {
        super(batterCake);
    }
    @Override
    public String getMsg() {
        return super.getMsg() + "+1根火腿肠";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
