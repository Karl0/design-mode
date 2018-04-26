package com.karl.test.main;

import com.karl.test.entity.C;
import com.karl.test.entity.I;

/**
 * 不关心谁执行任务，只是交代委派者需要执行的任务
 */
public class DelegateTest {

    public static void main(String[] args) {
        I i = new C();
        i.doing("m1");
        i.doing("m2");
    }

}
