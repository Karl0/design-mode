package com.karl.test.main.timetest;

import com.karl.test.hungry.HungrySington;
import com.karl.test.lazy.LazySingleton1;
import com.karl.test.lazy.LazySingleton2;

import java.util.concurrent.CountDownLatch;

public class SingletonTimeTest {

    public static void main(String[] args){
        int count = 20000000;

        //测试HungrySingleton生成时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            HungrySington.newInstance();
        }
        long end = System.currentTimeMillis();
        System.out.println("HungrySingleton总时间： " + (end - start));

        //测试LazySingleton1生成时间
        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            LazySingleton1.newInstance();
        }
        end = System.currentTimeMillis();
        System.out.println("LazySingleton1总时间： " + (end - start));

        //测试LazySingleton2生成时间
        start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            LazySingleton2.newInstance();
        }
        end = System.currentTimeMillis();
        System.out.println("LazySingleton2总时间： " + (end - start));

    }

}
