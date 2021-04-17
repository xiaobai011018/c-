package com.bsc.InterfaceMap;

public class TestMap {
    public static void main(String[] args) {
        Person.student student = new Person.student();
        System.out.println(student.getClass());
        Person person = new Person() {
        };
        System.out.println(person.getClass());
    }
}
class Person {
   static class student {

    }
}