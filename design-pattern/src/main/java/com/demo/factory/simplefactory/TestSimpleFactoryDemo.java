package com.demo.factory.simplefactory;

import com.demo.factory.ICourse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestSimpleFactoryDemo {

    public static void main(String[] args) {


        SimpleFactory simpleFactory = SimpleFactory.getInstance();
        ICourse java = simpleFactory.create_v1("java");
        java.startStudy();

        ICourse python = simpleFactory.create_v2("com.demo.factaory.PythonCourse");
        python.startStudy();
    }


}
