package com.karl.test.entity;

public class Shoes1 extends Shoes {

    private String name;

    private String size;

    public Shoes1() {
        this.name = "Adidas";
        this.size = "39";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

}
