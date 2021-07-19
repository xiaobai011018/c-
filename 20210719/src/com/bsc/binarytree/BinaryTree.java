package com.bsc.binarytree;

public class BinaryTree {
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(TreeNode root) {

    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(TreeNode root) {
        if (root==null){
            return -1;
        }
        if (getLeafSize2(root.left)==-1&&getLeafSize2(root.right)==-1) {
            leafSize++;
        }
        return -1;

    }
}
class TreeNode{
    public TreeNode left;
    public TreeNode right;
}