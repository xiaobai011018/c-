package com;

import java.util.Random;

class MyException extends RuntimeException {
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}
public class TestDemo {
    public static void ari(int x,int y)throws MyException {
        int ret = 0;
        try {
             ret = x/y;
        }catch (MyException e) {
            throw new MyException("错误");
        }
        System.out.println(ret);
    }
    public static void main(String[] args) {
        ari(10,0);
    }
    public static void main1(String[] args) {
        try {
            int x = 10/0;
        }catch (ArithmeticException e){
            System.out.println("除数为0");
        }finally {
            System.out.println("必然会被打印");
        }
        System.out.println("结束");

    }
}
