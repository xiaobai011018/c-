package com.bsc.binarytreemaxweigth;

import java.util.*;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<NewNode> q = new LinkedList<>();
        q.offer(new NewNode(root,0,0));
        int curDepth = 0;
        int left = 0;
        int maxWeth = 0;
        while(!q.isEmpty()){
            NewNode curNode = q.poll();
            if(curNode!=null){
                q.offer(new NewNode(curNode.node.left,2*curNode.pose,curNode.depth+1));
                q.offer(new NewNode(curNode.node.right,2*curNode.pose+1,curNode.depth+1));
                if(curDepth!=curNode.depth){
                    curDepth = curNode.depth;
                    left = curNode.pose;
                }
            }
            maxWeth = Math.max(maxWeth,curNode.pose-left+1);
        }
        return maxWeth;
    }
}
class NewNode{
    TreeNode node;
    int pose;
    int depth;
    public NewNode(TreeNode node,int pose,int depth){
        this.node = node;
        this.pose = pose;
        this.depth = depth;
    }
}