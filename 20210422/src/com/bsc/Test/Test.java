package com.bsc.Test;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        String str = "a b c d ";
        String[] s = str.split(" ",2);
        System.out.println(Arrays.toString(s));
        boolean matches = str.matches("//d+");
    }
}
