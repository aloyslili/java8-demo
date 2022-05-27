package com.yang.reflect.s01;

import java.lang.reflect.Field;

public class Demo01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // reflect 反射 （自省）
        // 反射是Java里 95%的框架的基础

        Person p = new Person("张三");
        p.show();
        Class<Person> c = Person.class;
        Field name = c.getDeclaredField("name");
        name.setAccessible(true); // 将字段设置为可访问
        String n = (String)name.get(p);
        System.out.println("反射拿到的name=" + n);

        name.set(p, "李四");
        p.show();
    }
}
