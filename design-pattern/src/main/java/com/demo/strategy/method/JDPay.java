package com.demo.strategy.method;

import com.demo.strategy.IPayment;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JDPay implements IPayment {
    @Override
    public void pay(String uid, String oid, double amount) {
        log.info("用户{}的订单{}使用京东支付了[{}元]...", uid, oid, amount);
    }
}
