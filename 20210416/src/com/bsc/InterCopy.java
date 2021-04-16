package com.bsc;
@SuppressWarnings({"all"})
class Person implements Cloneable {
    public String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
@SuppressWarnings({"all"})
public class InterCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person[] person1 = new Person[3];
        person1[0] = new Person("张三",13);
        person1[1] = new Person("李四",14);
        person1[2] = new Person("二毛",15);
        Person[] person2 = new Person[person1.length];
        person2[0] = (Person) person1[0].clone();
        person2[1] = (Person) person1[1].clone();
        person2[2] = (Person) person1[2].clone();
        System.out.println("======修改前========");
        System.out.println("person1=" + person1[1]);
        System.out.println("person2=" + person2);

        person2[1].name = "bsc";
        System.out.println("======修改后========");
        System.out.println("person1=" + person1);
        System.out.println("person2=" + person2);
    }
}
