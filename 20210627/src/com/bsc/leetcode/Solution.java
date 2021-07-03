package com.bsc.leetcode;

import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {

//        Integer a = new Integer(123);
//        System.out.println(a.toString());
//        StringBuffer sb = new StringBuffer();
//        sb.append(123);
//        sb.append(31);
//        System.out.println(sb);
//        TreeSet treeSet = new TreeSet();

//        System.out.println("123".);
//        treeSet.add(Integer.parseInt("13".substring(0)))
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] num = new int[m+n];
        int i = 0;
        int j = 0;
        int count = 0;
        if(m==0){
            if(n%2==0){
                return nums2[n/2]*1.0;
            }else{
                return (nums2[n/2-1] + nums2[n/2])/2.0;
            }
        }
        if(n==0){
            if(m%2==0){
                return nums1[m/2]*1.0;
            }else{
                return (nums1[m/2-1] + nums2[m/2])/2.0;
            }
        }
        while(count!=m+n){
            if(i==m){
                while(count!=m+n){
                    num[count++] = nums2[j++];
                }
                break;
            }
            if(j==n){
                while(count!=m+n){
                    num[count++] = nums1[i++];
                }
            }
            if(nums1[i]<nums2[j]){
                num[count++] = nums1[i++];
            }else{
                num[count++] = nums2[j++];
            }
        }
        if(count%2==0){
            return num[count/2]*1.0;
        }else{
            return (num[count/2-1] + num[count/2])/2.0;
        }

    }
}
