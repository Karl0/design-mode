package com.karl.test.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    private BeanFactory(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    //非原子性导致必须加synchronized,否则线程不安全
    public final static synchronized Object newInstance(String className) {
        System.out.println(ioc.containsKey(className));
        if(ioc.containsKey(className)){
            return ioc.get(className);
        }else {
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }

    }

}
