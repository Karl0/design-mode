package com.karl.test.payport;

import com.karl.test.entity.PayState;

public class UnionPay implements PayPort {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用银联支付！");
        System.out.println("查询余额，开示扣款！");
        return new PayState(200, amount, "支付成功！");
    }
}
