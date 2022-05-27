package com.yang.reflect.s01;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
