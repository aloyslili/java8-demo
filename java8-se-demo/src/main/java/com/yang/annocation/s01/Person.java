package com.yang.annocation.s01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 注释：给人看的
// 注解：给其他代码看的

@Nb
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;

    @Nb
    private Integer age;

    @Nb
    public void show() {
        System.out.println(name + "," + age);
    }
}



