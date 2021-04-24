package com.bsc.shellsort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = {3,12,23,123,54,211,124,87,1};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shellSort(int[] array) {
        int step = array.length/2;
        while(step!=0) {
            for (int i = step; i < array.length ; i++) {
                for (int j = i-step; j >= 0 ; j-=step) {
                    if (array[j]>array[j+step]) {
                        int tmp = array[j];
                        array[j] = array[j+step];
                        array[j+step] = tmp;
                    }
                }
            }
            step /= 2;
        }

    }
}
