package com.karl.test.entity;

public class PayState {

    private int code;
    private double amount;
    private String msg;

    public PayState(int code, double amount, String msg) {
        this.code = code;
        this.amount = amount;
        this.msg = msg;
    }

    public String toString(){
        return "支付状态：[" + code + "], " + msg + ", 交易详情：" + amount;
    }

}
