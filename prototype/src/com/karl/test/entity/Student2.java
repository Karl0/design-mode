package com.karl.test.entity;

public class Student2 implements Cloneable{

    private String name;
    private String age;
    private Teacher2 teacher2;

    public Student2() {
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

    public Teacher2 getTeacher2() {
        return teacher2;
    }

    public void setTeacher2(Teacher2 teacher2) {
        this.teacher2 = teacher2;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", teacher2.name=" + teacher2.getName() + '\'' +
                ", teacher2.age=" + teacher2.getAge() + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student2 student2 = (Student2) super.clone();
        student2.setTeacher2((Teacher2) teacher2.clone());
        return student2;
    }
}
