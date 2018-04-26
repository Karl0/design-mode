package com.karl.test.entity;

/**
 * 被委派者
 */
public class B implements I {
    @Override
    public void doing(String methodName) {
        System.out.println("B " + methodName);
    }
}
