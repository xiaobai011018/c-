package com.bsc.背包问题;

import org.junit.Test;

/**
 *  [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 *
 *   [[1,2,5],[3,2,1]]
 *   1 2 5
 *   3 2 1
 */
public class BackPack {
    public static void main(String[] args) {
       maxValue(new int[][]{{1,3,1}, {1,5,1},{4,2,1}});
    }
    public static int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = grid[i][0];
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(" " + dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[m - 1][n - 1];
    }
//    @Test
//    public void wei_bag(){
//        int[] weight = {1,3,4};
//        int[] value = {15,20,30};
//        int[][] dp = new int[3][5];
//        int bagWeight = 4;
//        for(int i = 0;i<weight.length;i++){
//            dp[i][0] = 0;
//        }
//        for(int i = 0;i<=bagWeight;i++){
//            if (weight[0]>i){
//                dp[0][i] = 0;
//            }else {
//                dp[0][i] = value[0];
//            }
//        }
//        for (int i = 1; i < weight.length; i++) {//先遍历背包
//            for (int j = 1; j <= 4; j++) {
//                if (weight[i]>j){
//                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
//                }
//            }
//        }
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                System.out.print(" "+dp[i][j]+" ");
//            }
//            System.out.println();
////        }
//    }
}
