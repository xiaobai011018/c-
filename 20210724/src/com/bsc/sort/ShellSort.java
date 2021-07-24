package com.bsc.sort;

import java.util.Arrays;
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
public class ShellSort {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode newRoot = new TreeNode(root1.val+root2.val);
        mergeTreesChild(newRoot.left,root1.left,root2.left);
        mergeTreesChild(newRoot.right,root1.right,root2.right);
        return newRoot;
    }
    public int mergeTreesChild(TreeNode newRoot,TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null) return 0;
        if(root1==null) return root2.val;
        if(root2==null) return root1.val;
        int left = mergeTreesChild(newRoot.left,root1.left,root2.left);
        newRoot.left = new TreeNode(left);
        int right = mergeTreesChild(newRoot.right,root1.right,root2.right);
        newRoot.right = new TreeNode(right);
        return root1.val + root2.val;
    }
    public static void main(String[] args) {
        int[] array = {32,54,1,21,67,22};
        selectSort(array);
       // shell(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void shell(int[] array){
        int group = array.length;
        while (group>1){
            group = group/3+1;
            shellSort(array,group);
        }
    }
    public static void shellSort(int[] array,int group){
        for (int i = group; i < array.length; i++) {
            int j = i-group;
            int temp = array[i];
            for (; j >= 0 ; j-=group) {
                if (array[j]>temp){
                    array[j+group] = array[j];
                }else {
                    break;
                }
            }
            array[j+group] = temp;
        }
    }
}
