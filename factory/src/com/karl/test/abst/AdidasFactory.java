package com.karl.test.abst;

import com.karl.test.entity.Shoes;
import com.karl.test.entity.Shoes1;
import com.karl.test.entity.Shoes3;

public class AdidasFactory extends AbstractFactory{

    private String name;

    public AdidasFactory() {
        this.name = "AdidasFactory";
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
        return new Shoes1();
    }

    @Override
    public Shoes makeShoes40() {
        return new Shoes3();
    }

}
