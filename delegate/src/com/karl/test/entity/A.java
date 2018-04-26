package com.karl.test.entity;

/**
 * 被委派者
 */
public class A implements I{

    @Override
    public void doing(String methodName) {
        System.out.println("A " + methodName);
    }
}
