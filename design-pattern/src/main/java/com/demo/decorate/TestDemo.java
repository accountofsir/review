package com.demo.decorate;

public class TestDemo {
    public static void main(String[] args) {
        BatterCake batterCake = new BaseBatterCake();
        batterCake = new EggBatterCake(batterCake);
        batterCake = new HamBatterCake(batterCake);
        batterCake = new EggBatterCake(batterCake);
        System.out.println(batterCake.getMsg()+"  总价："+batterCake.getPrice());

    }
}
