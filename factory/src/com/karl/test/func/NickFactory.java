package com.karl.test.func;

import com.karl.test.entity.Shoes;
import com.karl.test.entity.Shoes1;
import com.karl.test.entity.Shoes2;

public class NickFactory extends  FunctionFactory{

    private String name;

    public NickFactory() {
        this.name = "NickFactory";
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

    @Override
    public Shoes makeShoes() {
        return new Shoes2();
    }

}
