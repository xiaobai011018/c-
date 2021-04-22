package com.bsc.selectsort;

import java.util.Arrays;

public class SelectSortDemo {
    public static void main(String[] args) {
            int[] arr = {3,2,6,123,532,12};
            selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[] array) {
        int minIndex = 0;
        int min = 0;
        for (int i = 0; i < array.length-1; i++) {
            minIndex = i;
            min = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (min>array[j]) {
                    minIndex = j;
                    min = array[j];
                }
            }
            if (minIndex!=i) {
                array[minIndex] = array[i];
                array[i] = min;

            }
        }
    }

}
