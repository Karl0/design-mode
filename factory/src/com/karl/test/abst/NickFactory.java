package com.karl.test.abst;

import com.karl.test.entity.Shoes;
import com.karl.test.entity.Shoes2;
import com.karl.test.entity.Shoes4;

public class NickFactory extends AbstractFactory{

    private String name;

    public NickFactory() {
        this.name = "NickFactory";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Shoes makeShoes39() {
        return new Shoes2();
    }

    @Override
    public Shoes makeShoes40() {
        return new Shoes4();
    }
}
