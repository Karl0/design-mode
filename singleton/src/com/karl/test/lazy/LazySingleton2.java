package com.karl.test.lazy;

public class LazySingleton2 {

    private boolean initialized = false;

    private LazySingleton2(){
        synchronized (LazySingleton2.class){
            if (initialized == false){
                initialized = !initialized;
            }else {
                throw new RuntimeException("企图创建多个实例！");
            }
        }
    }

    private static class LazyInner{
        private final static LazySingleton2 lazySingleton2 = new LazySingleton2();
    }

    public static final LazySingleton2 newInstance(){
        return LazyInner.lazySingleton2;
    }

}
