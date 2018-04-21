package com.karl.test.main;

import com.karl.test.entity.Student1;
import com.karl.test.entity.Teacher1;

public class SimpleCopyTest {


    public static void main(String[] args) {

        Teacher1 teacher1 = new Teacher1();
        teacher1.setName("Tom");
        teacher1.setAge("40");
        Student1 student1 = new Student1();
        student1.setName("Jerry");
        student1.setAge("16");
        student1.setTeacher1(teacher1);
        System.out.println(student1);
        Student1 student11 = null;
        try {
            student11 = (Student1) student1.clone();
            student11.setName("Jerry1");
            student11.setAge("18");
            student11.getTeacher1().setName("Tom1");
            student11.getTeacher1().setAge("39");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(student1);
        System.out.println(student11);
    }


}
