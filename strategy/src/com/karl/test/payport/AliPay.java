package com.karl.test.payport;

import com.karl.test.entity.PayState;

public class AliPay implements PayPort{
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝！");
        System.out.println("查询余额，开始扣款！");
        return new PayState(200, amount,"支付成功");
    }
}
