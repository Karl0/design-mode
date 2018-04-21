package com.karl.test.lazy;

public class LazySingleton1 {

    private LazySingleton1(){ }

    private static LazySingleton1 lazySingleton1 = null;

    public final static synchronized LazySingleton1 newInstance() {
        if (lazySingleton1 == null) {
             lazySingleton1 = new LazySingleton1();
        }
        return lazySingleton1;
    }
}
