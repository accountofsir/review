package com.demo.proxy.staticproxy;

public class Father implements Person {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("-------inc-------");
        person.findLove();
        System.out.println("--------end--------------");
    }
}
