package com.karl.test.main;

import com.karl.test.entity.Order;
import com.karl.test.entity.PayState;
import com.karl.test.payport.PayType;

public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order("101", "10120188501500", 69.50);
        PayState payState = order.pay(PayType.WECHAT_PAY);
        System.out.println(payState);
    }

}
