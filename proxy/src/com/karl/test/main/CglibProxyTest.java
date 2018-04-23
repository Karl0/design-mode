package com.karl.test.main;

import com.karl.test.advice.Advice;
import com.karl.test.advice.FindJobAdvice;
import com.karl.test.cglibproxy.Proxyer;
import com.karl.test.entity.Worker2;

public class CglibProxyTest {

    public static void main(String[] args) {
        Proxyer proxyer = new Proxyer();
        Worker2 worker = (Worker2) proxyer.getInstance(new Worker2("Karl"), new FindJobAdvice());
        System.out.println(worker.getClass());
        worker.findJob();
    }

}
