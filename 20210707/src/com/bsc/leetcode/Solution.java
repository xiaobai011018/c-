package com.bsc.leetcode;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else {
                if (stack.size()!=0) {
                    char pop = stack.pop();
                    if (s.charAt(i) == ']') {
                        if (pop != '[') {
                            return false;
                        }
                    }
                    if (s.charAt(i) == '}') {
                        if (pop != '{') {
                            return false;
                        }
                    }
                    if (s.charAt(i) == ')') {
                        if (pop != '(') {
                            return false;
                        }
                    }
                }else {
                    return false;
                }
            }
        }
        if (stack.size()!=0){
            return false;
        }
        return true;
    }
}
