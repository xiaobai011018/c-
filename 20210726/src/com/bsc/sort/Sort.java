package com.bsc.sort;
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
public class Sort {

    public static void main(String[] args) {
        int[] array = {32,12,52,13,54};
        //quickSort(array);
        mergeSort1(array);
        System.out.println(Arrays.toString(array));
    }
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reachEnd = false;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(reachEnd&&cur != null) return false;
            if(cur==null){
                reachEnd = true;
                continue;
            }
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return true;
    }
    public boolean isCompleteTree1(TreeNode root) {
        return isCompleteTreeChild(root.left,root.right);
    }
    public boolean isCompleteTreeChild(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left!=null&&right==null) return true;
        if(left==null&&right!=null) return false;
        return isCompleteTreeChild(left.left,left.right)&&(isCompleteTreeChild(right.left,right.right));
    }
    public static void merge1(int[] array,int group){
        int s1 = 0;
        int e1 = s1+group-1;
        int s2 = e1+1;
        int k = 0;
        int[] tmp = new int[array.length];
        int e2 = s2+group-1<array.length?s2+group-1:array.length-1;
        while(s2<array.length){
            while (s1<= e1 && s2<=e2){
                if (array[s1]<array[s2]){
                    tmp[k++] = array[s1++];
                }else {
                    tmp[k++] = array[s2++];
                }
            }
            while(s1<=e1){
                tmp[k++] = array[s1++];
            }
            while (s2<=e2){
                tmp[k++] = array[s2++];
            }
            s1 = e2+1;
            e1 = s1+group-1;
            s2 = e1+1;
            e2 = s2+group-1<array.length?s2+group-1:array.length-1;
        }
        while (s1<array.length){
            tmp[k++] = array[s1++];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tmp[i];
        }
    }
    public static void mergeSort1(int[] array){
        for (int i = 1; i < array.length; i*=2) {
            merge1(array,i);
        }
    }
    public static void mergeSortInternal(int[] array,int low,int high){
        if (low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSortInternal(array,low,mid-1);
        mergeSortInternal(array,mid+1,high);
        merge(array,low,mid,high);
    }
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);

    }
    public static void merge(int[] array,int start,int mid,int end){
        int s1 = start;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = end;
        int[] tmp = new int[end-start+1];
        int k = 0;
        while(s1<=e1&&s2<=e2){
            if (array[s1]<array[s2]){
                tmp[k++] = array[s1++];
            }else {
                tmp[k++] = array[s2++];
            }
        }
        while(s1<=e1){
            tmp[k++] = array[s1++];
        }
         while(s2<=e2){
            tmp[k++] = array[s2++];
        }
        for (int i = 0; i < tmp.length; i++) {
            array[i+start] = tmp[i];
        }
    }

    public static void quickSort(int[] array) {
        int start = 0;
        int end = array.length-1;
        Stack<Integer> stack = new Stack<>();
        int pivot = partition(array,start,end);
        if (pivot>start+1){
            stack.push(start);
            stack.push(pivot-1);
        }
        if (pivot<end-1){
            stack.push(pivot+1);
            stack.push(end);
        }
        while (!stack.isEmpty()){
            end = stack.pop();
            start = stack.pop();
             pivot = partition(array,start,end);
            if (pivot>start+1){
                stack.push(start);
                stack.push(pivot-1);
            }
            if (pivot<end-1){
                stack.push(pivot+1);
                stack.push(end);
            }
        }
    }
    public static void selectPivotMedianOfThree(int[] array,int start,int end,int mid) {
    //array[mid] <= array[start] <= array[end]
        if (array[mid]>array[end]){
            int temp = array[mid];
            array[mid] = array[end];
            array[end] = temp;
        }
        if (array[mid]>array[start]){
            int temp = array[mid];
            array[mid] = array[start];
            array[start] = temp;
        }
    }
    public static void quickSort1(int[] array) {
        quickSortInternal(array,0,array.length-1);
    }
    public static void quickSortInternal(int[] array,int left,int right){
        if (left>=right) return;
        int pivot = partition(array,left,right);
        quickSortInternal(array,left,pivot-1);
        quickSortInternal(array,pivot+1,right);
    }
    public static int partition(int[] array,int left,int right){
        int i = left;
        int j = right;
        int temp = array[i];
        while(i<j){
            while (i<j&&array[j]>temp){
                j--;
            }
            array[i] = array[j];
            while (i<j&&array[i]<temp){
                i++;
            }
            array[j] = array[i];
        }
        array[i] = temp;
        return i;
    }
}
