package com.bsc.binarytree;

import java.util.List;
import java.util.Stack;

public class Test {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode cur = root;
        if(root==null){
            return null;
        }
        while(cur!=null || !stack2.empty()){
            while(cur!=null) {
                stack1.push(cur.val);
                stack2.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack2.pop();
            cur = top.right;
        }
        return stack1;
    }
}
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

