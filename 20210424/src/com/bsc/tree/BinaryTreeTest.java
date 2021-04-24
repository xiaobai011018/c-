package com.bsc.tree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<Integer, String> integerStringBinaryTree = new BinaryTree<>();
        integerStringBinaryTree.put(1,"张三");
        integerStringBinaryTree.put(3,"李四");
        integerStringBinaryTree.put(2,"王五");
        integerStringBinaryTree.put(4,"三七");
        integerStringBinaryTree.put(5,"二八");
        int i = integerStringBinaryTree.maxDepth();
        System.out.println(i);
//        System.out.println(integerStringBinaryTree.getSize());
//        String s = integerStringBinaryTree.get(2);
//        System.out.println(s);
//        System.out.println(integerStringBinaryTree.getSize());
//        String s = integerStringBinaryTree.get(2);
//        System.out.println(s);
//        System.out.println(integerStringBinaryTree.maxKey());
//        System.out.println(integerStringBinaryTree.minKey());

//        integerStringBinaryTree.delete(2);
//        System.out.println(integerStringBinaryTree.getSize());
    }
}
