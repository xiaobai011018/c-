package com.bsc;

public class IsSort {
    public static boolean ifSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
