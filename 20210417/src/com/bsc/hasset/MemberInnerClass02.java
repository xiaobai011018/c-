package com.bsc.hasset;

public class MemberInnerClass02 {
    public static void main(String[] args) {
        Person person = new Person();
        person.func();
        //Person.Student student = person.new Student();
       // student.func();
        Person.Student student1 = person.func2();
        Person person1 = new Person() {
        };
        System.out.println(person1.getClass());
        Person.Student student2 = new Person.Student();
    }
}
class Person {
    private String name;
    private int age;
    public static class Student {
        public void func() {
            System.out.println("成员内部类");
        }
    }
    public void func() {
        Student student = new Student();
        student.func();
    }
    public Student func2() {
        return new Student();
    }

}
