package com.bsc.doubleLinkedList;




public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        Person1 per1 = new Person1("张三", 12);
        Person1 per2 = new Person1("李四", 13);
        Person1 per3 = new Person1("王二麻", 14);
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addList(per1);
        doubleLinkedList.addList(per2);
        doubleLinkedList.addList(per3);
        System.out.println("删除前");
        doubleLinkedList.showList();
        doubleLinkedList.del(12);
        System.out.println("删除后");
        doubleLinkedList.showList();
        doubleLinkedList.del(13);
        System.out.println("删除后");
        doubleLinkedList.showList();
        doubleLinkedList.del(14);
        System.out.println("删除后");
        doubleLinkedList.showList();
        //Person1 person1 = new Person1("王五", 12);
       // doubleLinkedList.modiData(person1);
        //doubleLinkedList.del(12);
     //   doubleLinkedList.showList();
    }
}
@SuppressWarnings({"all"})
class DoubleLinkedList {
    Person1 head = new Person1("",0);
    public Person1 getHead() {
        return head;
    }
    public void del(int n) {
        if (head.next==null) {
            System.out.println("链表为空");
        }
        boolean flag = false;
        Person1 tmp = head.next;
        while(true) {
            if (tmp.age==n) {
                flag = true;
                break;
            }
            if (tmp.next==null) {
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            tmp.pre.next = tmp.next;
            if (tmp.next!=null) {
                tmp.next.pre = tmp.pre;
            }
        } else {
            System.out.println("不存在该数据");
        }
    }
    public void modiData(Person1 Node) {
        if (head.next==null) {
            System.out.println("链表为空");
            return;
        }
        Person1 tmp = head.next;
        boolean flag = false;
        while(true) {
            if (tmp.age==Node.age) {
                flag = true;
                break;
            }
            if (tmp==null) {
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            tmp.name = Node.name;

        }else {
            System.out.println("没有对应的数据");
        }
    }
    public void showList() {
        if (head.next==null) {
            System.out.println("链表为空");
            return;
        }
        Person1 tmp = head.next;
        while(tmp!=null) {
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }
    public void addList(Person1 person) {
        Person1 tmp = head;
        while(true) {
            if (tmp.next==null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = person;
        person.pre = tmp;
    }
}
class Person1 {
    public String name;
    public int age;
    public Person1 next;
    public Person1 pre;
    public Person1(String name, int age) {
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
