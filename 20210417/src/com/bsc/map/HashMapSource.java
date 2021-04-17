package com.bsc.map;

import java.util.HashMap;
@SuppressWarnings({"all"})
public class HashMapSource {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(i,"hello");
        }
        hashMap.put("qwe","qqwe");
        System.out.println(hashMap);
    }
}
