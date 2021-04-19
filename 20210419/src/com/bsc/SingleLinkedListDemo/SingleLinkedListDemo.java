package com.bsc.SingleLinkedListDemo;
@SuppressWarnings({"all"})
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Person person1 = new Person("张三",12);
        Person person2 = new Person("李四",32);
        Person person3 = new Person("王五",14);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addList(person1);
        singleLinkedList.addList(person2);
        singleLinkedList.addList(person3);
        singleLinkedList.showList();
    }
}
@SuppressWarnings({"all"})
class SingleLinkedList {
    private Person head = new Person("",0);
    public void addList(Person person) {
        Person tmp = head;
        while(true) {
            if (tmp.next==null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = person;
    }
    public void showList() {
        if (head.next==null) {
            System.out.println("链表为空");
            return;
        }
        Person tmp = head.next;
        while(tmp!=null) {
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }
}
class Person {
    private String name;
    private int age;
    public Person next;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}