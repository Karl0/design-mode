package com.karl.test.entity;

public class Student1 implements Cloneable{

    private String name;
    private String age;
    private Teacher1 teacher1;

    public Student1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Teacher1 getTeacher1() {
        return teacher1;
    }

    public void setTeacher1(Teacher1 teacher1) {
        this.teacher1 = teacher1;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", teacher1.name='" + teacher1.getName() + '\'' +
                ", teacher1.age='" + teacher1.getAge() + '\'' +
                '}';
    }

    /**
     * 浅拷贝
     * @return Object
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
