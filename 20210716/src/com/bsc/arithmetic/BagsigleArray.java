package com.bsc.arithmetic;

import org.junit.Test;

public class BagsigleArray {
    @Test
    public void arithmetic(){
        int[] weight = {1,3,4};
        int[] value = {15,20,30};
        int maxBagWeight = 4;
        int[] dp = new int[maxBagWeight+1];
        int bag = weight.length;
        for (int i = 0; i < bag; i++) {
            for (int j = maxBagWeight; j >= weight[i] ; j--) {
                dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
            for (int m = 0; i < dp.length; m++) {
                System.out.print(dp[m] + " ");
            }

//            dp = new int[weight.length+1];
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
