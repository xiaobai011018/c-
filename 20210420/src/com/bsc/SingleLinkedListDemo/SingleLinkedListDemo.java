package com.bsc.SingleLinkedListDemo;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Person person1 = new Person("张三",12);
        Person person2 = new Person("李四",32);
        Person person3 = new Person("王五",14);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addList(person1);
        singleLinkedList.addList(person2);
        singleLinkedList.addList(person3);
//        singleLinkedList.addByOrder(person1);
//        singleLinkedList.addByOrder(person2);
//        singleLinkedList.addByOrder(person3);
        singleLinkedList.showList();
        reversePrint2(singleLinkedList.getHead());
        //reversePrint1(singleLinkedList.getHead());

//        singleLinkedList.showList();
//        reverseList(singleLinkedList.getHead());
//        singleLinkedList.showList();
//        singleLinkedList.showList();
//        singleLinkedList.del(person2);
//        singleLinkedList.showList();
//        System.out.println(listSize(singleLinkedList.getHead()));
//        System.out.println(searchNode(singleLinkedList.getHead(), 3));
        //singleLinkedList.addList(person1);
        //singleLinkedList.addList(person2);
        //singleLinkedList.addList(person3);
//        singleLinkedList.showList();
//        Person person = new Person("bsc", 12);
//        singleLinkedList.modiData(person);
//        singleLinkedList.showList();
    }
    public static void reversePrint2(Person head) {
        if (head.next==null) {
            System.out.println(head);
        }else{
            reversePrint2(head.next);
            if (head.age!=0) {
                System.out.println(head);
            }
        }
    }
    public static void reversePrint1(Person head) {
        if (head.next==null) {
            return;
        }
        Stack stack = new Stack();
        Person cur = head.next;
        while(cur!=null) {
            stack.push(cur);
            cur = cur.next;
        }
        while(stack.size()>0) {
            System.out.println(stack.pop());
        }
    }
    public static void reverseList(Person head) {
        if (head.next==null||head.next.next==null) {
            return;
        }
        Person cur = head.next;
        Person next = null;
        Person newHead = new Person("",0);
        while(cur!=null) {
            next = cur.next;
            cur.next = newHead.next;
            newHead.next = cur;
            cur = next;
        }
        head.next = newHead.next;
    }
    public static int listSize(Person head) {
        if (head.next==null) {
            return 0;
        }
        Person tmp = head.next;
        int count = 0;
        while(tmp!=null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
    public static Person searchNode(Person head,int index) {
        if (head.next==null) {
            System.out.println("链表为空");
            return null;
        }
        Person fast = head.next;
        Person slow = head.next;
       if (index>listSize(head)) {
           System.out.println("数据错误");
           return null;
       }
        for (int i = 0; i < index; i++) {
            fast = fast.next;
        }
        while(fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
@SuppressWarnings({"all"})
class SingleLinkedList {
    public Person getHead() {
        return head;
    }

    private Person head = new Person("",0);
    public void del(Person person) {
        if (head.next==null) {
            System.out.println("链表为空");
        }
        boolean flag = false;
        Person tmp = head;
        while(true) {
            if (tmp.next.age==person.age) {
                flag = true;
                break;
            }
            if (tmp.next==null) {
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            tmp.next = tmp.next.next;
        } else {
            System.out.println("不存在该数据");
        }
    }
    public void modiData(Person Node) {
        if (head.next==null) {
            System.out.println("链表为空");
            return;
        }
        Person tmp = head.next;
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
    public void addByOrder(Person Node) {
        Person tmp = head;
        boolean flag = false;
        while(true) {
            if (tmp.next==null) {
                break;
            }
            if (tmp.next.age>Node.age) {
                break;
            }
            if (tmp.next.age==Node.age) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            System.out.println("添加失败");
            return;
        } else {
                Node.next = tmp.next;
                tmp.next = Node;
                return;
        }

    }
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
    public String name;
    public int age;
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