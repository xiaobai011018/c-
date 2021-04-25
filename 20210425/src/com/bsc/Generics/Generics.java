package com.bsc.Generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Generics {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap = new HashMap<String, Student>();
        Student student = new Student("张三",12);
        Student student1 = new Student("李四",34);
        Student student2 = new Student("王二麻", 123);
        hashMap.put(student.getName(),student);
        hashMap.put(student1.getName(),student1);
        hashMap.put(student2.getName(),student2);
        for (Student stu :hashMap.values()) {
            System.out.println(stu);
        }
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getValue());
        }

    }
}
class Student{
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
