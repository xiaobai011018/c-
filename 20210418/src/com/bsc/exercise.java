package com.bsc;

public class exercise {
    public static void main(String[] args) {
        Animal bird = new Bird();

    }
}
class Animal {
    public int age;
    public void eat() {
        System.out.println("eat");
    }
}
class Bird extends Animal{
    public void fly() {
        System.out.println("fly");
    }
}
