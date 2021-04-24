package com.bsc.tree;

import java.util.Queue;

public class BinaryTree<Key extends Comparable<Key>,Value>{
    private Node root;
    private int N;
    private class Node{
        public Key key;
        private Value value;
        public Node left;
        public Node right;
        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public int getSize(){
        return N;
    }
    public void put(Key key,Value value) {
           root = put(root,key,value);
    }
    private Node put(Node x,Key key,Value value){
        if (x==null) {
            N++;
            return new Node(key,value,null,null);
        }
        int tmp = key.compareTo(x.key);
        if (tmp>0) {
            x.right = put(x.right,key,value);
        }else if (tmp<0) {
            x.left = put(x.left,key,value);
        }else {
            x.value = value;
        }
        return x;
    }
    public Value get(Key key) {
        return get(root,key);
    }
    private Value get(Node x,Key key) {
        if (x==null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp>0) {
            return get(x.right,key);
        }else if (cmp<0) {
            return get(x.left,key);
        }else {
            return x.value;
        }
    }
    public void delete(Key key) {
        delete(root,key);
    }
   private Node delete(Node x,Key key){
        if (x==null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp>0) {
           x.right = delete(x.right,key);
        }else if (cmp<0) {
            x.left = delete(x.left,key);
        }else {
            N--;
            if (x.left == null && x.right != null) {
                return x.right;
            }
            if (x.right == null && x.left != null) {
                return x.left;
            }

            Node minNode = x.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            Node n = x.right;
            while (n.left != null) {
                if (n.left.left == null) {
                    n.left = null;
                    break;
                } else {
                    n = n.left;
                }
            }
            minNode.left = x.left;
            minNode.right = x.right;
            x = minNode;
        }
       return x;
    }
    public Key minKey(){
        return minKey(root).key;
    }
    private Node minKey(Node x) {
        if (x.left!=null) {
            return minKey(x.left);
        } else {
            return x;
        }

    }
    public Key maxKey(){
        return maxKey(root).key;
    }
    private Node maxKey(Node x) {
        if (x.right!=null) {
            return maxKey(x.right);
        }else {
            return x;
        }
    }
    public int maxDepth(){
        return maxDepth(root);
    }
    private int maxDepth(Node x){
        int max = 0;
        int maxL = 0;
        int maxR = 0;
        if (x==null){
            return 0;
        }
        if (x.left!=null){
            maxL = maxDepth(x.left);
        }
        if (x.right!=null){
            maxR = maxDepth(x.right);
        }
        max = maxL>maxR?maxL+1:maxR+1;
        return max;
    }
//    public Queue<Key> preErgodic(){
//        Queue<Key> keys = new Queue<>();
//    }
//    private void preErgodic(Node x,Queue<Key> keys){
//
//    }
}

