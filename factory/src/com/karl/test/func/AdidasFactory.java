package com.karl.test.func;

import com.karl.test.entity.Shoes;
import com.karl.test.entity.Shoes1;
import com.karl.test.entity.Shoes2;

public class AdidasFactory extends FunctionFactory{

    private String name;

    public String getName() {
        return name;
    }

    public AdidasFactory() {
        this.name = "AdidasFactory";
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Shoes makeShoes() {
        return new Shoes1();
    }

}
