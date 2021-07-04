package com.bsc.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        backTracking(candidates,target,0,0);
        return result;
    }
    private void backTracking(int[] candidates,int target,int startIndex,int sum){
        if(sum==target){
            result.add(new ArrayList(path));
            return;
        }
        for(int i = startIndex;i<candidates.length;i++){
            sum += candidates[i];
            backTracking(candidates,target,i+1,sum);
            path.remove(path.size()-1);
        }
    }
//    List<List<String>> result = new ArrayList<>();
//    List<String> path = new ArrayList<>();
//    public List<List<String>> partition(String s) {
//
//        backTracking(s,0);
//        return result;
//    }
//    private void backTracking(String s,int startIndex){
//        if(startIndex==s.length()){
//            result.add(new ArrayList(path));
//            return;
//        }
//        for(int i = startIndex;i<s.length();i++){
//            if(isPartition(s,startIndex,i)){
//                path.add(s.substring(startIndex,startIndex+1));
//            }else{
//                continue;
//            }
//            backTracking(s,i+1);
//            path.remove(path.size()-1);
//        }
//    }
//    private boolean isPartition(String s,int left,int right){
//        while(left<right){
//            if(s.charAt(length)!=s.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//    }
}
