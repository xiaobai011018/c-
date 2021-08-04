package com.bsc.leetcode;

import javax.swing.tree.TreeNode;
import java.util.*;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
public class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        Queue<TreeNode> q = new LinkedList<>();
//        List<List<Integer>> list2 = new ArrayList<>();
//        if(root==null) return list2;
//        q.offer(root);
//        while(!q.isEmpty()){
//            int length = q.size();
//            List<Integer> list1 = new ArrayList<>();
//            for(int i = 0;i<length;i++){
//                TreeNode cur = q.poll();
//                list1.add(cur.val);
//                if(cur.left!=null){
//                    q.offer(cur.left);
//                }
//                if(cur.right!=null){
//                    q.offer(cur.right);
//                }
//            }
//            list2.add(list1);
//        }
//        return list2;
//    }
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        ArrayList<Integer> list = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return bulidTree(list);
    }
    private Node bulidTree(ArrayList<Integer> list){
        Node newHead = new Node(-1);
        Node cur = newHead;
        for(int i = 0;i<list.size();i++){
            Node node =  new Node(list.get(i));
            cur.right = node;
            node.left = cur;
            cur = cur.right;
        }
        newHead.right.left = null;
        return newHead.right;

    }
}
