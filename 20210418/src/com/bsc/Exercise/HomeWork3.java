package com.bsc.Exercise;

public class HomeWork3 {
    public static String myToString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1) {
                ret += array[i] + "]";
            }else {
                ret += array[i] + ",";
            }

        }
        return ret;
    }

    public static int[] mycopyOf (int[] source) {
        int[] dest = new int[source.length];
        for (int i = 0; i < dest.length; i++) {
            dest[i] = source[i];
        }
        return dest;
    }
    public static int binarySearch(int[] array,int key) {
        int right = array.length-1;
        int left = 0;
        while(left<right) {
            int mid = (right+left)/2;
            if (array[mid] > key) {
                right = mid-1;
            }else if (array[mid]<key) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static boolean ifSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(myToString(array));
        //System.out.println(ifSort(array));
    }
}
