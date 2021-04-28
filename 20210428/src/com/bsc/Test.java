package com.bsc;

import com.bsc.tree.RedBlackTree;

public class Test {
    public static void main(String[] args) {
        RedBlackTree<String, String> stringStringRedBlackTree = new RedBlackTree<>();
        stringStringRedBlackTree.put("1","张三");
        stringStringRedBlackTree.put("2","李四");
        stringStringRedBlackTree.put("3","王五");
        String s1 = stringStringRedBlackTree.get("1");
        System.out.println(s1);
        String s2 = stringStringRedBlackTree.get("2");
        System.out.println(s2);
        String s3 = stringStringRedBlackTree.get("3");
        System.out.println(s3);
        stringStringRedBlackTree.put("2","大雅");
        String s = stringStringRedBlackTree.get("2");
        System.out.println(s);
    }
}
