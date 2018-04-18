package com.karl.test.entity;

public class Shoes4 extends Shoes {

    private String name;

    private String size;

    public Shoes4() {
        this.name = "Nick";
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
