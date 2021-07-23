package com.bsc.propertiesqueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
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
public class Test {
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        TreeNode newRoot = new TreeNode(-1);
        TreeNode cur;
        List<TreeNode> list = new ArrayList<>();
        inorder(root,list);
        cur = newRoot;
        for(int i = 0;i<list.size();i++){
            cur.right = list.get(i);
            cur = cur.right;
        }
        return newRoot.right;
    }
    public void inorder(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> priorityQueue = new PriorityQueue<>(3, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(0)+o2.get(1)-o1.get(0)+o1.get(1);
            }
        });
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> list = new ArrayList<>();
                if (priorityQueue.size()<k){
                    list.add(nums1[i]);
                    list.add(nums2[j]);
                    priorityQueue.offer(list);
                }else {
                    List<Integer> peek = priorityQueue.peek();
                    if (nums1[i]+nums2[j]<(peek.get(0)+ peek.get(1))){
                        priorityQueue.poll();
                        list.add(nums1[i]);
                        list.add(nums2[j]);
                        priorityQueue.offer(list);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(priorityQueue.poll());
        }
        return list;
    }
}
//    List<List<Integer>> list2 = new ArrayList<>();
//
//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        return new PriorityQueue<Integer>();
//    }
//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        PriorityQueue<Person> queue = new PriorityQueue<>(k,new Comparator{
//            public int compare(list1<Integer> o1, list1<Integer> o2) {
//                return o1.get(0)+o1.get(1)-o2.get(0)+o2.get(1);
//            }
//        });
//        for(int i = 0;i<nums1.length;i++){
//            for(int j = 0;j<nums2.length;j++){
//                List<Integer> list1 = new ArrayList<>();
//                list1.add(nums1[i]);
//                list1.add(nums2[j]);
//                list2.add(list1);
//            }
//        }
//        for(int i = 0;i<list2.size();i++){
//
//        }
//    }
//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        PriorityQueue<Person> queue = new PriorityQueue<>(k,new Comparator{
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            });
//        for(int i = 0;i<nums1.length;i++){
//                for(int j = 0;j<nums2.length;j++){
//                    List<Integer> list1 = new ArrayList<>();
//                    list1.add(nums1[i]);
//                    list1.add(nums2[j]);
//                    list2.add(list1);
//                }
//            }
//
//        }
//}
//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        PriorityQueue<Person> queue = new PriorityQueue<>(k,new Comparator{
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            });
//                for(int i = 0;i<nums1.length;i++){
//                for(int j = 0;j<nums2.length;j++){
//                    List<Integer> list1 = new ArrayList<>();
//                    list1.add(nums1[i]);
//                    list1.add(nums2[j]);
//                    list2.add(list1);
//                }
//            }
//
//        }
//    public static void main(String[] args) {
//        PriorityQueue<Person> queue = new PriorityQueue<>(3, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return 0;
//            }
//        });
////        List<Integer> list1 = new ArrayList<>();
//        list1.
//        queue.offer(new Person(13,"bsc"));
//        queue.offer(new Person(16,"123"));
//        System.out.println(queue);
//    }
//}
//class Person implements Comparator<Person>{
//    int age;
//    String name;
//
//    public Person(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        return o1.age-o2.age;
//    }
//}
