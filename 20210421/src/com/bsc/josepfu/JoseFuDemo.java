package com.bsc.josepfu;

public class JoseFuDemo {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(50);
        circleSingleLinkedList.showBoy();
        circleSingleLinkedList.jumpCircle(1,2,50);
    }
}
class CircleSingleLinkedList {
    Boy first;
    public void jumpCircle(int k,int m,int nums) {
        if (k<=0 || k>nums || m<=0 ) {
            System.out.println("输入数据有误");
            return;
        }
        if (first == null) {
            System.out.println("数据为空");
            return;
        }
        Boy curBoy = first;
        while(true) {
            if (curBoy.next==first) {
                break;
            }
            curBoy = curBoy.next;
        }
        for (int i = 0; i < m-1; i++) {
            first = first.next;
            curBoy = curBoy.next;
        }
        while(true) {
            if (curBoy==first) {
                break;
            }
            for (int i = 0; i < m-1; i++) {
                first = first.next;
                curBoy = curBoy.next;
            }
            System.out.println("出圈小孩的编号：" + first.getTip());
            first = first.next;
            curBoy.next = first;
        }
        System.out.println("最后留下的小孩编号" + first.getTip());
    }
    public void showBoy() {
        if (first == null) {
            System.out.println("数据为空");
            return;
        }
        Boy curBoy = first;
        while(true) {
            if (curBoy.next==first) {
                System.out.println("男孩编号" + curBoy.getTip());
                break;
            }
            System.out.println("男孩编号" + curBoy.getTip());
            curBoy = curBoy.next;
        }
    }
    public void addBoy(int num) {
        if (num <= 0) {
            System.out.println("数据不合法");
            return;
        }
        Boy curBoy = null;
        for (int i = 1; i <= num ; i++) {
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                curBoy = first;
            }else {
                curBoy.next = boy;
                boy.next = first;
                curBoy = boy;
            }
        }
    }
}
class Boy {
    private int tip;
    public Boy next;
    public Boy(int tip) {
        this.tip = tip;
    }

    public int getTip() {
        return tip;
    }
}