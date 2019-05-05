package com.demo.factory.simplefactory;

import com.demo.factory.ICourse;
import com.demo.factory.JavaCourse;
import com.demo.factory.PythonCourse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Objects;

@Slf4j
public class SimpleFactory implements Serializable {
    private SimpleFactory() {}
    private static class SingleHolder {
        private static final SimpleFactory SINGLE_INSTANCE = new SimpleFactory();
    }
    public static SimpleFactory getInstance() {
        return SingleHolder.SINGLE_INSTANCE;
    }

    public Object readResolve() {
        return SingleHolder.SINGLE_INSTANCE;
    }
    //创建对象 方式一
    public ICourse create_v1(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        }
        return null;
    }
    //方式二
    public ICourse create_v2(String className) {
        try {
            if (StringUtils.isNotBlank(className)) {
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            log.error("create object error...", e);
        }

        return null;
    }
    //方式三
    public ICourse create_v3(Class<?> clazz) {
        try {
            if (Objects.nonNull(clazz)) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            log.error("create object error...", e);
        }

        return null;
    }
}
