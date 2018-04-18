package com.karl.test.abst;

import com.karl.test.entity.Shoes;

public abstract class AbstractFactory {

    private String name;

    public AbstractFactory() { }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AbstractFactory{" +
                "name='" + name + '\'' +
                '}';
    }

    abstract public Shoes makeShoes39();

    abstract public Shoes makeShoes40();

}
