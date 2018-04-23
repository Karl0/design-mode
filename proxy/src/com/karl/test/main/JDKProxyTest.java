package com.karl.test.main;

import com.karl.test.advice.FindJobAdvice;
import com.karl.test.entity.Person;
import com.karl.test.entity.Worker;
import com.karl.test.jdkproxy.Proxyer;

import java.lang.reflect.Proxy;

public class JDKProxyTest {

    public static void main(String[] args) {
        Proxyer proxyer = new Proxyer();
        Person person =  (Person)proxyer.getInstance(new Worker("Karl"), new FindJobAdvice());
        System.out.println(person.getClass());
        person.findJob();

    }

}
