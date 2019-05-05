package com.demo.proxy.dynamic;

import com.demo.proxy.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {

    private Person person;

    public InvocationHandlerImpl(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----before---");
        Object result = method.invoke(person, args);
        System.out.println("----after----");
        return result;
    }
}
