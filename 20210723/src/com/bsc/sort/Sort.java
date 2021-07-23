package com.bsc.sort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {3,123,632,12,63};
        new Sort().insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    public void insertSort(int[] array) {
        int tmp = -1;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j = i-1;
            for (; j >=0 ; j--) {
                if (array[j]>tmp){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
}
