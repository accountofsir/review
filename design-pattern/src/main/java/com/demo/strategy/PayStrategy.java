package com.demo.strategy;

import com.demo.strategy.method.ALiPay;
import com.demo.strategy.method.JDPay;
import com.demo.strategy.method.UnicomPay;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class PayStrategy {
    private static final Map<PayMethod, IPayment> map = new HashMap<>();
    static {
        map.put(PayMethod.ALiPay, new ALiPay());
        map.put(PayMethod.JDPay, new JDPay());
        map.put(PayMethod.UnicomPay, new UnicomPay());
    }
    public static IPayment getPayment(PayMethod payMethod) {
        IPayment iPayment = map.get(payMethod);
        if (iPayment == null) {
            iPayment = map.get(PayMethod.ALiPay);
        }
        return iPayment;
    }
}
