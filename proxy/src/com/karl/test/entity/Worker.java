package com.karl.test.entity;

public class Worker implements Person{

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void findJob(){
        System.out.println(this.name + " is finding job...");
    }

}
