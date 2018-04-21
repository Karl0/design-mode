package com.karl.test.main;

import com.karl.test.entity.Student2;
import com.karl.test.entity.Teacher2;

public class DeepCopyTest {

    public static void main(String[] args) {
        //模板
        Teacher2 teacher2 = new Teacher2();
        teacher2.setName("Tom");
        teacher2.setAge("40");
        Student2 student2 = new Student2();
        student2.setName("Jerry");
        student2.setAge("16");
        student2.setTeacher2(teacher2);
        System.out.println(student2);

        //克隆
        Student2 student21 = null;
        try {
            student21 = (Student2) student2.clone();
            student21.setName("Jerry1");
            student21.setAge("39");
            student21.getTeacher2().setName("Tom1");
            student21.getTeacher2().setAge("20");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(student2);
        System.out.println(student21);

    }

}
