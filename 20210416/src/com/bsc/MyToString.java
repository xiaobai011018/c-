package com.bsc;

import java.util.Arrays;

@SuppressWarnings({"all"})
public class MyToString {
    public static String myToString(int[] array) {
        String str = new String();

        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1) {
                str =str +  array[i] + "]";
            } else if(i==0){
                str ="[" + array[i] + ",";
            } else {
                str = str + array[i] + ",";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(myToString(array));

    }
}
