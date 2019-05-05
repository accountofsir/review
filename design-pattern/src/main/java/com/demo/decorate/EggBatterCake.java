package com.demo.decorate;

public class EggBatterCake extends BatterCakeDecorate {
    public EggBatterCake(BatterCake batterCake) {
        super(batterCake);
    }
    @Override
    public String getMsg() {
        return super.getMsg() + " +1个煎蛋";
    }
    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }
}
