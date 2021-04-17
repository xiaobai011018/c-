package com.bsc.hasset;

public class InnerClassExercise {
    public static void main(String[] args) {
        func1(new IO(){
            @Override
            public void func() {
                System.out.println("==================================");
            }
        });
    }
    public static void func1(IO io) {
        System.out.println("============");
    }
}
interface IO {
    void func();
}