package com.karl.test.main;

import com.karl.test.lazy.LazySingleton2;

public class test {
    public static void main(String[] args) {
        LazySingleton2 lazySingleton2 = LazySingleton2.newInstance();
        System.out.println(lazySingleton2);
        LazySingleton2 lazySingleton21 = LazySingleton2.newInstance();
        System.out.println(lazySingleton21);
    }

}
