package com.bsc.reflection;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectioCreateInstance {
    public static void main(String[] args) throws Exception {
        Class<File> fileClass = File.class;
        Constructor<File> constructor = fileClass.getConstructor(String.class);
        File file = constructor.newInstance("d:\\bsc.txt");
        file.createNewFile();
//        Class<?> personClass = Class.forName("com.bsc.reflection.Person");
//        Object o = personClass.newInstance();
//        Field sal = personClass.getField("sal");
//        sal.set(o,123.2);
//        System.out.println(sal.get(o));
//        Field name = personClass.getDeclaredField("name");
//        name.setAccessible(true);
//        name.set(o,"柏诗成");
//        System.out.println(name.get(o));
//        System.out.println(o);
//        Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
//        Object user = constructor.newInstance("张三", 13);
//        System.out.println(user);
//        Constructor<?> declaredConstructor = personClass.getDeclaredConstructor(int.class);
//        declaredConstructor.setAccessible(true);
//        Object o1 = declaredConstructor.newInstance(3);
//        System.out.println(o1);
    }
}
class Person{
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    private Person(int age){
        this.age = age;
    }
    private String name;
    private static int age;
    public double sal;
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}