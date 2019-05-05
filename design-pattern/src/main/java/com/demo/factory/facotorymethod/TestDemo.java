package com.demo.factory.facotorymethod;

import com.demo.factory.ICourse;

public class TestDemo {

    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse java = javaCourseFactory.create();
        java.startStudy();
    }
}
