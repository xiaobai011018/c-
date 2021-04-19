package com.bsc;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

@SuppressWarnings({"all"})
public class QueueArray {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        boolean flg = true;
        Scanner scanner = new Scanner(System.in);
        while(flg) {
            System.out.println("'a'---添加数据");
            System.out.println("'b'---取出数据");
            System.out.println("'c'---显示数据");
            System.out.println("'d'---退出程序");
            char arr = scanner.next().charAt(0);
            switch (arr) {
                case 'a':{
                    System.out.println("请输入你要添加的数据");
                    int sz = scanner.nextInt();
                    queue.addData(sz);
                    break;
                }
                case 'b':{
                    System.out.println(queue.getData());
                    break;
                }
                case 'c': {
                    queue.showQueue();
                    break;
                }
                case 'd': {
                    System.out.println("退出成功!");
                    flg = false;
                    break;
                }
                default:

            }
        }
    }
}
class Queue {
    private int maxSize;
    private int rear;
    private int front;
    private int[] array;
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        this.rear = -1;
        this.front = -1;
    }
    public boolean ifFull() {
        if (rear==maxSize-1) {
            System.out.println("队列已满,无法添加元素");
            return false;
        }
        return true;
    }
    public void addData(int n) {
        if (!ifFull()) {
            System.out.println("队列已满，无法添加元素");
        } else {
            rear++;
            array[rear] = n;
        }
    }
    public boolean ifEmpty() {
        if (rear==front) {
            System.out.println("队列为空");
            return false;
        }
        return true;
    }
    public int getData() {
        if (!ifEmpty()) {
             throw new RuntimeException("队列为空");
        }else {
            return array[++front];
        }
    }
    public void showQueue() {
        if (!ifEmpty()) {
            throw new RuntimeException("队列为空，无法显示队列");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        }
    }
}
