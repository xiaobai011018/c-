package com.bsc;

public class MyArrayList {
    public static void main(String[] args) {

    }
}
class N{
    int[] elem;
    int useSize;
    public void remove(int key ){
        int index = -1;
        int i = 0;
        for (i = 0; i <elem.length ; i++) {
            if (elem[i]==key) {
                index = i;
                break;
            }
        }
        if (i==elem.length){
            return;
        }
        for (i = index; i < elem.length-1; i++) {
            elem[i] = elem[i+1];
        }
        useSize--;
    }
}
