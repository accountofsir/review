package com.demo.factory.facotorymethod;

import com.demo.factory.ICourse;
import com.demo.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
