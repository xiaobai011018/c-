package com.bsc.Exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        //treeSet.add(new Person());
        HashSet hashSet = new HashSet();
        //hashSet.add(new Person());
        hashSet.add(new Person());
        TreeMap treeMap = new TreeMap();
        treeMap.put(new Person(),123);
    }
}
class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}