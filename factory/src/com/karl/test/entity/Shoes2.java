package com.karl.test.entity;

public class Shoes2 extends Shoes {

    private String name;

    private String size;

    public Shoes2() {
        this.name = "Nick";
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
