package com.karl.test.jdkproxy;

import com.karl.test.advice.Advice;
import com.karl.test.entity.Worker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Proxyer implements InvocationHandler {

    private Object obj;
    private Advice advice;

    public Proxyer() {
    }

    public Object getInstance(Object obj, Advice advice){
        this.obj = obj;
        this.advice = advice;
        Class clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        advice.beforeMethod();
        Object result = method.invoke(this.obj, args);
        advice.afterMethod();
        return result;
    }
}
