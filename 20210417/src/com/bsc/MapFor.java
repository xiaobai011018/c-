package com.bsc;

import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("张三","李四");
        map.put("张qw","qwe四");
        map.put("张t","李q");
        map.put("张qw","李w");
        Set set = map.keySet();
//        for (Object o :set) {
//            System.out.println(o + "  " + map.get(o));
//        }
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next + "  " + next);
//        }
        Set set1 = map.entrySet();
        for (Object o :set1) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }


    }
}
