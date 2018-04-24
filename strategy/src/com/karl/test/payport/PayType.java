package com.karl.test.payport;

import com.karl.test.entity.PayState;

public enum PayType {

    WECHAT_PAY(new WeChatPay()),
    ALI_PAY(new AliPay()),
    UNION_PAY(new UnionPay());

    private PayPort payPort;
    PayType(PayPort payPort) {
        this.payPort = payPort;
    }

    public PayPort getPayPort(){
        return this.payPort;
    }


}
