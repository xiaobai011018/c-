package com.bsc.test;

import com.bsc.MaxPriorityQueue.MaxPriorityQueue;

public class MaxPriorityQueueTest {
    public static void main(String[] args) {
        MaxPriorityQueue<String> stringMaxPriorityQueue = new MaxPriorityQueue<String>(5);
        stringMaxPriorityQueue.insert("A");
        stringMaxPriorityQueue.insert("B");
        stringMaxPriorityQueue.insert("C");
        stringMaxPriorityQueue.insert("D");
        stringMaxPriorityQueue.insert("E");
        while(!stringMaxPriorityQueue.isEmpty()){
            String s = stringMaxPriorityQueue.delMax();
            System.out.print(s+" ");
        }
    }
}
