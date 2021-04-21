package com.bsc.arraystack;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("pop:出栈");
            System.out.println("push:入栈");
            System.out.println("show:显示栈");
            System.out.println("exit:退出程序");
            String arr = scanner.next();
            switch (arr) {
                case "pop":{
                    try {
                        int value = arrayStack.popStack();
                        System.out.println(value);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "push":{
                    System.out.println("请输入你要添加的数据");
                    int value = scanner.nextInt();
                    arrayStack.pushStack(value);
                    break;
                }
                case "show":{
                    arrayStack.showStack();
                    break;
                }
                case "exit":{
                    System.out.println("退出成功");
                    flag = false;
                    break;
                }
            }
        }

    }
}
class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }
    public boolean ifFull() {
        return top==maxSize-1;
    }
    public boolean ifEmpty() {
        return top==-1;
    }
    public void pushStack(int value) {
        if (ifFull()) {
            System.out.println("栈已满，无法添加数据");
            return;
        }
        top++;
        stack[top] = value;
    }
    public int popStack() {
        if (ifEmpty()) {
            throw new RuntimeException("栈空间为空，无法取出数据");
        }
        return stack[top--];
    }
    public void showStack() {
        if (ifEmpty()) {
            System.out.println("栈为空");
            return;
        }
        for (int i = top; i >=0 ; i--) {
            System.out.println(stack[i]);
        }
    }
}
