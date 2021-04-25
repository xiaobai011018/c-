package com.bsc;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int[] array = {3,3};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(array, 6)));

    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int c1 = 0;
        int c2 = 0;
        for(int i =0;i<nums.length;i++){
            for(int j = 1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target){
                    c1 = i;
                    c2 = j;
                    break;
                }
            }
        }
        int[] array = {c1,c2};
        return array;
    }
}
