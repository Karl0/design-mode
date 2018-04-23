package com.karl.test.entity;

public class Worker2 {

    private String name;

    //必须有无参构造器
    public Worker2(){}

    public Worker2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void findJob(){
        System.out.println(this.name + " is finding job...");
    }

}
