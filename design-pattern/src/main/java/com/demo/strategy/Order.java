package com.demo.strategy;

import com.demo.util.Result;

public class Order {

    private String uid;
    private String oid;
    private double amount;
    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }
    public Result order(PayMethod payMethod) {
        IPayment payment = PayStrategy.getPayment(payMethod);
        payment.pay(uid, oid, amount);
        return Result.getResult(Result.SUCCESS, "success...");
    }
}
