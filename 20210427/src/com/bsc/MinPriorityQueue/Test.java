package com.bsc.MinPriorityQueue;

public class Test {
    public static void main(String[] args) {
        MinpriorityQueue<String> minpriorityQueue = new MinpriorityQueue(10);
        minpriorityQueue.insert("E");
        minpriorityQueue.insert("D");
        minpriorityQueue.insert("C");
        minpriorityQueue.insert("B");
        minpriorityQueue.insert("A");
        while(!minpriorityQueue.isEmpty()){
            System.out.println(minpriorityQueue.delMin());
        }


    }
}
