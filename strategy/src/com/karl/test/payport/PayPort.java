package com.karl.test.payport;

import com.karl.test.entity.PayState;

public interface PayPort {

    public PayState pay(String uid, double amount);

}
