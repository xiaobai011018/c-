package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        ArrayList
        treeMap.put(1,"123");
        treeMap.put(45,"123");
        treeMap.put(3,"123");
        treeMap.put(4,"123");
        System.out.println(treeMap);
    }
//    public static void main(String[] args) {
////        char[] chars = "abc".toCharArray();
////        ArrayList arrayList = new ArrayList();
////        arrayList.contains()
//        System.out.println(lengthOfLongestSubstring("abba"));
////        HashMap map = new HashMap();
////        map.containsKey()
//    }
////    public static int lengthOfLongestSubstring(String s) {
//
////        HashMap<Character,Integer> map = new HashMap<>();
////        int end = 0;
////        int start = 0;
////        int count = 0;
////        for( end = 0;end<s.length();end++){
////            if(map.containsKey(s.charAt(end))){
////                start = Math.max(map.get(s.charAt(end))+1,start);
////            }
////            count = Math.max(end-start+1,count);
////            map.put(s.charAt(end),end);
////        }
////        return count;
////        HashMap<Character, Integer> map = new HashMap<>();
////        int max = 0, start = 0;
////        for (int end = 0; end < s.length(); end++) {
////            char ch = s.charAt(end);
////            if (map.containsKey(ch)){
////                start = Math.max(map.get(ch)+1,start);
////            }
////            max = Math.max(max,end - start + 1);
////            map.put(ch,end);
////        }
////        return max;
////        char[] chars = s.toCharArray();
////        int count = 0;
////        int curNum = 0;
////        ArrayList<Character> al = new ArrayList<>();
////        for(int i = 0;i<=chars.length-1;i++){
////            al.add(chars[i]);
////            curNum = 1;
////            if(i!=chars.length-1){
////                for(int j = i+1;j<=chars.length-1;j++){
////                    if(!al.contains(chars[j])){
////                        al.add(chars[j]);
////                        curNum++;
////                    }else{
////                        break;
////                    }
////                }
////            }
////            al.removeAll(al);
////            count = count>curNum?count:curNum;
////        }
////        return count;
//    }
}
