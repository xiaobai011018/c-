package com.bsc.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
    public static int reverse(int x) {
        long n = 0;
        while(x!=0){
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n?(int)n:0;
    }
    public static void main1(String[] args) {
//        StringBuffer sb = new StringBuffer("abc");
//        System.out.println(sb.reverse());
//        System.out.println(sb.substring(1));
//        sb.deleteCharAt(0);
//        System.out.println(Integer.parseInt("-123"));
//        Long.pa
    }

}
