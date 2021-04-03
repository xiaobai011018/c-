
package com;
import java.time.*;
class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("eat");
    }
}
class Bird extends Animal {
    public Bird (String name) {
        super(name);
        System.out.println(super.name);
    }

    public void fly() {
        System.out.println("fly");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        //Animal animal = new Animal("abc");
        Bird bird = new Bird("haha");
    }
}
