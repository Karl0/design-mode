package com.karl.test.func;

import com.karl.test.entity.Shoes;

public abstract class FunctionFactory {

    private String name;

    public FunctionFactory() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }

    abstract public Shoes makeShoes();

}
