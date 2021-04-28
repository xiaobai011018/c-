package com.bsc;
@SuppressWarnings({"all"})
public class indexMinPriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int[] pq;
    private int[] qp;
    private int N;

    public indexMinPriorityQueue(int capacity) {
        items = (T[]) new Comparable[capacity+1];
        pq = new int[capacity+1];
        qp = new int[capacity+1];
        for (int i = 0; i < pq.length; i++) {
            pq[i] = -1;
            qp[i] = -1;
        }
    }

    private boolean less(int i, int j){
        return items[pq[i]].compareTo(items[pq[j]])<0;
    }
    private void exch(int i,int j) {
        
    }
    public int delMin(){
        return 0;
    }
    public void insert(int i,T t){}
    private void swim(int k){}
    private void sink(int k){}
    public int size(){
        return N;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public boolean contains(int k){
        return false;
    }
    public void changeitems(int i,T t) {}
    public int minIndex(){
        return 0;
    }
    public void delete(int i){}

}
