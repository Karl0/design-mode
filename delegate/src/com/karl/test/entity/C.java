package com.karl.test.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 委派者
 */
public class C implements I{

    //将谁执行什么任务注册
    private Map<String, I> map = new HashMap<>();

    public C() {
        map.put("m1", new A());
        map.put("m2", new B());
    }

    @Override
    public void doing(String methodName) {
        map.get(methodName).doing(methodName);
    }
}
