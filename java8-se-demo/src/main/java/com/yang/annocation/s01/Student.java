package com.yang.annocation.s01;

import lombok.AllArgsConstructor;

public class Student extends Person {

    public Student(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void show() {
        // super.show();
        System.out.println("重写了父类的方法");
    }

    public static void main(String[] args) {
        Student s = new Student("张三", 18);
        s.show();
    }
}
