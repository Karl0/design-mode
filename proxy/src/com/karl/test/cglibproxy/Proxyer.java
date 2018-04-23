package com.karl.test.cglibproxy;

import com.karl.test.advice.Advice;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Proxyer implements MethodInterceptor {

    private Object obj;
    private Advice advice;

    public Object getInstance(Object obj, Advice advice){
        this.obj = obj;
        this.advice = advice;
        Class clazz = obj.getClass();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        advice.beforeMethod();
        Object result = methodProxy.invoke(this.obj, args);
        //Object result = method.invoke(this.obj, args);
        advice.afterMethod();
        return result;
    }
}
