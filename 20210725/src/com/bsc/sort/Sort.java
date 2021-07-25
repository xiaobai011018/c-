package com.bsc.sort;

import java.util.Arrays;

public class Sort {
    public static void quickSort(int[] array) {
        quickSortInternal(array,0,array.length-1);
    }
    public static void quickSortInternal(int[] array,int left,int right){
        if (left>=right) return;
        int pivot = partition(array,left,right);
        quickSortInternal(array,left,pivot-1);
        quickSortInternal(array,pivot+1,right);
    }
    public static int partition(int[] array,int left,int right){
        int i = left;
        int j = right;
        int temp = array[i];
        while(i<j){
            while (i<j&&array[j]>temp){
                j--;
            }
            array[i] = array[j];
            while (i<j&&array[i]<temp){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] array = {32,12,5,13,63,14};
        quickSort(array);
        //heapSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void heapSort(int[] array) {
        createHeap(array);
        int i = array.length-1;
        while (i>=0){
            swap(array,0,i);
            sinkDown(array,i,0);
            i--;
        }
    }
    public static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void createHeap(int[] array){
        for (int i = 0; i < array.length; i++) {
            sinkDown(array,array.length,i);
        }
    }
    public static void sinkDown(int[] array,int length,int parent) {
        int child = 2*parent+1;
        while (child<length){
            if (child+1<length){
                child = array[child]>array[child+1]?child:child+1;
                if (array[child]>array[parent]){
                    int temp = array[child];
                    array[child] = array[parent];
                    array[parent] = temp;
                }else {
                    break;
                }
            }else {
                if (array[child]>array[parent]){
                    int temp = array[child];
                    array[child] = array[parent];
                    array[parent] = temp;
                }else {
                    break;
                }
            }
            parent = child;
            child = 2*parent +1;
        }
    }
}
