package com.bsc.tree;

public class RedBlackTree<Key extends Comparable<Key>,Value> {
    private Node root;
    private int N;
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    private class Node{
        public Key key;
        private Value value;
        public Node left;
        public Node right;
        public boolean color;

        public Node(Key key, Value value, Node left, Node right, boolean color) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }
    public int size(){
        return N;
    }
    private boolean isRed(Node x){
        if (x==null) {
            return false;
        }
        return x.color;
    }
    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }
    private Node rotateRight(Node h){
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        return x;
    }
    private void flipColors(Node h){
        h.right.color = BLACK;
        h.left.color = BLACK;
        h.color = RED;
    }
    public void put(Key key,Value value){
           root =  put(root,key,value);
            root.color = BLACK;
    }
    private Node put(Node h,Key key,Value value){
        if (h == null) {
            N++;
            return new Node(key,value,null,null,RED);
        }
        int tmp = key.compareTo(h.key);
        if (tmp<0) {
            h.left = put(h.left,key,value);
        }else if (tmp>0){
            h.right = put(h.right,key,value);
        }else {
            h.value = value;
        }
        if (isRed(h.left)&&isRed(h.left.left)){
            h = rotateRight(h);
        }
        if (!isRed(h.left)&&isRed(h.right)){
            h = rotateLeft(h);
        }
        if (isRed(h.right)&&isRed(h.left)){
            flipColors(h);
        }
        return h;
    }
    public Value get(Key key){
        return get(root,key);
    }
    private Value get(Node x,Key key){
        if (x==null){
            return null;
        }
        int i = key.compareTo(x.key);
        if (i<0){
            return get(x.left,key);
        }else if (i>0){
            return get(x.right,key);
        }else {
            return x.value;
        }
    }
}
