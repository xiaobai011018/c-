package com.bsc.binartree;

import javax.xml.soap.Node;

class TreeNode{
    public TreeNode leftTree;
    public TreeNode rightTree;
    public int val;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinaryTree {
    public void inorder(TreeNode node){
        if (node==null) {
            return;
        }
        inorder(node.leftTree);
        System.out.println(node.val);
        inorder(node.rightTree);
    }
    public void preorder(TreeNode node){
        if (node==null){
            return;
        }
        System.out.println(node.val);
        inorder(node.leftTree);
        inorder(node.rightTree);
    }
    public void traversal(TreeNode node){
        if (node==null){
            return;
        }
        inorder(node.leftTree);
        inorder(node.rightTree);
        System.out.println(node.val);
    }
}
