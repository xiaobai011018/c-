package com.bsc.leetcode;

import java.util.ArrayList;
import java.util.List;
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
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0;i<=31;i++){
            if((n&1)==1){
                count++;
            }
            n>>>=1;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
//        TreeNode p = new TreeNode();
//        TreeNode p1 = new TreeNode();
//        p1.val = 2;
//        p.val = 1;
//        p.left = p1;
//        TreeNode q = new TreeNode();
//        TreeNode q2 = new TreeNode();
//        q.val = 1;
//        q2.val = 2;
//        q.right = q2;
//        System.out.println(isSameTree(p, q));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null){
            return false;
        }
        if(p==null&&q==null){
            return true;
        }
        if(p.val!=q.val){
            return false;
        }
        isSameTree(p.left,q.left);
        isSameTree(p.right,q.right);
        return true;
    }

//        public List<Integer> inorderTraversal(TreeNode root) {
//            ArrayList<Integer> list = new ArrayList();
//            inorder(root,list);
//            return list;
//        }
//        public void inorder(TreeNode root,List<Integer> list){
//            if(root==null){
//                return;
//            }
//            inorder(root.left,list);
//            list.add(root.val);
//            inorder(root.right,list);
//        }
//}
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//          this.left = left;
//         this.right = right;
//      }
  }