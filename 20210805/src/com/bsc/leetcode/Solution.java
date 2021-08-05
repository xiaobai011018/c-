package com.bsc.leetcode;

import java.util.Stack;

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
    public TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> stack = new Stack<>();
        int i = 0;
        while(i<traversal.length()){
            int level = 0;
            while(traversal.charAt(i)=='-'){
                level++;
                i++;
            }
            int val = 0;
            while(traversal.charAt(i)!='-'){
                val = val*10+(traversal.charAt(i)-'0');
                i++;
            }
            while(stack.size()>level){
                stack.pop();
            }
            TreeNode node = new TreeNode();
            if(!stack.isEmpty()){
                if(stack.peek().left==null){
                    stack.peek().left = node;
                }else{
                    stack.peek().right = node;
                }
            }
            stack.push(node);
        }
        while(stack.size()!=1){
            stack.pop();
        }
        return stack.pop();
    }
}
