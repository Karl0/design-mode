package com.karl.test.entity;

public abstract class Shoes {

    private String name;

    private String size;

    public Shoes() {
    }

    public String getName() {
        return name;
    }

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
