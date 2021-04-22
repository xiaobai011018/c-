package com.bsc.calculator;

import java.util.Scanner;

//使用栈完成表达式的计算思路
//        1.通过一个index值(索引)，来遍历我们的表达式
//        2.如果我们发现是一一个数字,就直接入数栈
//        3.如果发现扫描到是一个符号，就分如下情况
//        3.1如果发现当前的符号栈为空，就直接入栈
//        3.2如果符号栈有操作符，就进行比较,如果当前的操作符的优先级小于或者等于核中
//        的操作符，就需要从数栈中pop出两个数在从符号栈中pop出- -个符号，进行运算，
//        将得到结果，入数栈，然后将当前的操作符入符号栈，如果当前的操作符的优先级大
//        于栈中的操作符，就直接入符号栈
//        4.当表达式扫描完毕,就顺序的从数栈和符号栈中pop出相应的数和符号，并运行.
//        5.最后在数栈只有一个数字,就是表达式的结果
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exception = scanner.nextLine();
        ArrayStack numStack = new ArrayStack(10);
        ArrayStack operaStack = new ArrayStack(10);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        char ch = 0;
        int opera = 0;
        int res = 0;
        String keepNum = "";
        while(true) {
            ch = exception.substring(index,index+1).charAt(0);
            if (operaStack.ifOperator(ch)){
                if (!operaStack.ifEmpty()) {
                    if (operaStack.Priority(ch) <= operaStack.Priority(operaStack.peek())) {
                        num1 = numStack.popStack();
                        num2 = numStack.popStack();
                        opera = operaStack.popStack();
                         res = numStack.calcNum(num1,num2,opera);
                        numStack.pushStack(res);
                        operaStack.pushStack(ch);
                    }else {
                        operaStack.pushStack(ch);
                    }
                }else {
                    operaStack.pushStack(ch);
                }
            }else {
                //入数栈
                keepNum += ch;
                if (index == exception.length()-1) {
                    numStack.pushStack(Integer.parseInt(keepNum));
                }else {
                    if (numStack.ifOperator(exception.substring(index + 1, index + 2).charAt(0))) {
                        numStack.pushStack(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }
            index++;
            if (index >= exception.length()) {
                break;
            }
        }
        while(true) {
            if (operaStack.ifEmpty()) {
                break;
            }
            num1 = numStack.popStack();
            num2 = numStack.popStack();
            opera = operaStack.popStack();
             res = numStack.calcNum(num1,num2,opera);
            numStack.pushStack(res);
        }
        System.out.println("表达式结果是:" + res);

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
    public int peek() {
        return stack[top];
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
    public boolean ifOperator(char ch) {
        return (ch == '+'|| ch == '-' || ch == '*' || ch == '/');
    }
    public int Priority(int ch) {
        if (ch == '*' || ch == '/') {
            return 1;
        }else if (ch == '+' || ch == '-') {
            return 0;
        }else {
            return -1;
        }
    }
    public int calcNum(int num1, int num2, int ch) {
        int res = 0;
        switch (ch) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num2 * num1;
                break;
            case '/':
                res = num2 / num1;
                break;
        }
        return res;
    }

}