package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        lastStoneWeightII(new int[]{31,26,33,21,40});
    }
    public static int lastStoneWeightII(int[] stones) {
        int[] dp = new int[15000];
        for(int i = 0;i<stones.length;i++){
            for(int j = stones.length;j>=stones[i];j--){
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+ stones[i]);
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        return dp[0];
    }
}
