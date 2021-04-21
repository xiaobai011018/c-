package com.bsc.sourcecode;

import java.util.Arrays;

public class SourceCode {
    public static void main(String[] args) {
        Object[] array = {1,"2",3,new Person("张三",12)};
        System.out.println(Arrays.toString(array));
    }
}
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
