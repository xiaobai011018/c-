package com.bsc.sequence;
@SuppressWarnings({"all"})
public class SequenceList<T> {
    private T array[];
    public SequenceList(T[] array) {
        this.array = array;
    }
    
}
class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}