package com.bsc.HomeWork;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        func1(array);
        System.out.println(Arrays.toString(array));
    }
    public static void func2(int[] array1,int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }
    public static void func1(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left<right) {
            while(array[left]%2==0)
            {
                left++;
            }
            while(array[right]%2!=0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
}
