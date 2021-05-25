package com.bsc.draw;

public class Tset extends A {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);
    }
    public void func(){
        this.func1();
    }
}
class A{
    public void func1(){
        System.out.println("调用了func");
    }
}
