package com.bsc.heap;

public class HeapTest {
    public static void main(String[] args) {
        Heap<String> stringHeap = new Heap<String>(10);
        stringHeap.insert("A");
        stringHeap.insert("B");
        stringHeap.insert("C");
        stringHeap.insert("D");
        stringHeap.insert("E");
        stringHeap.insert("F");
        String s = stringHeap.delMax();
        while((s = stringHeap.delMax())!=null) {
            System.out.println(s);
        }
    }
}
