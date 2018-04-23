package com.karl.test.advice;

public class FindJobAdvice implements Advice{
    @Override
    public void beforeMethod() {
        System.out.println("Proxyer is helping worker...");
    }

    @Override
    public void afterMethod() {
        System.out.println("worker finded job...");
    }
}
