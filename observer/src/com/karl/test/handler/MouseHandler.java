package com.karl.test.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MouseHandler extends MouseEventListener implements InvocationHandler {

    private Object obj;

    public Object newInstance(Object obj){
        this.obj = obj;
        Class<?> clazz = obj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(this.obj, args);
        this.trigger(method.getName());
        return null;
    }

}
