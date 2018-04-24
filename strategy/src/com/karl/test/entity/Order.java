package com.karl.test.entity;

import com.karl.test.payport.PayType;

public class Order {

    private String uid;
    private String oid;
    private double amount;

    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }

    public PayState pay(PayType payType){
        return payType.getPayPort().pay(this.uid, this.amount);
    }

}
