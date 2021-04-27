package com.bsc.MinPriorityQueue;
@SuppressWarnings({"all"})
public class MinpriorityQueue<T extends Comparable<T>> {
    private T[] items;
    private int N;

    public MinpriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity+1];
    }
    public int size(){
        return N;
    }
    public boolean isEmpty() {
        return N==0;
    }

    private boolean less (int i, int j) {
        return items[i].compareTo(items[j])<0;
    }
    private void exch(int i,int j ){
        T tmp = items[i];
        items[i] = items[j];
        items[j] = tmp;
    }
    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }
    public T delMin(){
        T tmp = items[1];
        exch(1,N);
        N--;
        sink(1);
        return tmp;
    }
    private void swim(int k){
        while(k>1) {
            if (less(k,k/2)){
                exch(k/2,k);
                k = k/2;
            }else {
                break;
            }
        }
    }
    private void sink(int k){
            while(2*k<=N) {
                int min;
                if (2*k+1<=N) {
                    if (less(2*k,2*k+1)) {
                        min = 2*k;
                    }else {
                        min = 2*k+1;
                    }
                }
                min = 2*k;
                if (less(k,min)) {
                    break;
                }
                exch(min,k);
                k = min;
            }
    }
}
