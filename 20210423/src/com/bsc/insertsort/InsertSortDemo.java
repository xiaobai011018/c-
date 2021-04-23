package com.bsc.insertsort;

import java.util.Arrays;

@SuppressWarnings({"all"})
public class InsertSortDemo {
    public static void main(String[] args) {
            int[] array = {12,34,3,123,51};
            insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int comValue = array[i];
            int index = i-1;
            while((index>=0)&&(comValue<array[index])) {
                array[index+1] = array[index];
                index--;
            }
            array[index+1] = comValue;
        }
    }

}
