package com.bsc.linkedstack;

import jdk.nashorn.internal.ir.CallNode;

public class LinkedStackDemo {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        Person person1 = new Person("张三",12);
        Person person2 = new Person("李四",13);
        Person person3 = new Person("王五",15);
        linkedStack.pushStack(person1);
        linkedStack.pushStack(person2);
        linkedStack.pushStack(person3);
        //linkedStack.showStack();
       linkedStack.popStack();
        linkedStack.showStack();
    }

}
class LinkedStack {
    private Person head = new Person("",0);
    public void pushStack(Person value) {
        value.next = head.next;
        head.next = value;
    }
    public Person popStack() {
        Person tmp = head.next;
        head.next = head.next.next;
        return tmp;
    }
    public void showStack() {
        if (head.next==null) {
            System.out.println("链表为空");
            return;
        }
        Person tmp = head.next;
        while(tmp != null) {
            System.out.println(tmp);
            tmp = tmp.next;
        }

    }

}
class Person {
    private String name;
    private int age;
    public Person next;
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
