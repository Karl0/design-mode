package com.karl.test.entity;

public class Shoes3 extends Shoes {

    private  String name;

    private  String size;

    public Shoes3() {
        this.name = "Adidas";
        this.size = "40";
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
