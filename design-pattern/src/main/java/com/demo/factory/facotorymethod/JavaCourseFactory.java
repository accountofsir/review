package com.demo.factory.facotorymethod;

import com.demo.factory.ICourse;
import com.demo.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
