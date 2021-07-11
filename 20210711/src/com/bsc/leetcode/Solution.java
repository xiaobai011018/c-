package com.bsc.leetcode;

public class Solution {
    public static void main(String[] args) {
        new Solution().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1});
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2;i<cost.length;i++){
            dp[i] = Math.min(dp[i-1],dp[i-2])+cost[i];
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        int minCost = Math.min(dp[cost.length-1],dp[cost.length-2]);
        return minCost;
    }
}
