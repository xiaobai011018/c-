package com.bsc.infixexpression;

import javafx.collections.transformation.TransformationList;

import java.util.*;
@SuppressWarnings({"all"})
public class InfixExpression {
    public static void main(String[] args) {
       // String s = "1234s";
        String str = "2+(3+2)*5";
        List list = new ArrayList();
        list = Transformation(str);
        System.out.println(list);
       // System.out.println(s.matches("\\d+"));
        System.out.println(Transformationsuffix(list));

        //List transformationsuffix = Transformationsuffix(list);
    }
    public static List Transformationsuffix(List<String> ls) {
        Stack stack = new Stack();
        Equal equal = new Equal();
        List<String> list = new ArrayList<String>();
        for (String item :ls) {
            if (item.matches("\\d+")) {
                list.add(item);
            } else if (item.equals("(")){
                stack.push(item);
            } else if (item.equals(")")){
                while(!stack.peek().equals("(")) {
                    list.add((String) stack.pop());
                }
                stack.pop();
            } else {
                while (stack.size()!=0&&equal.equalOperation(item)<=equal.equalOperation((String) stack.peek())){
                    list.add((String)stack.pop());
                }
                stack.push(item);
            }
        }
            while(stack.size()!=0) {
                list.add((String) stack.pop());
            }
            return list;
    }

    public static List Transformation(String str) {
        ArrayList ls = new ArrayList();
        char ch;
        int i = 0;
        String keepstr;
        do {
            if ((ch = str.charAt(i)) < 48 || (ch = str.charAt(i))>57) {
                ls.add("" + ch);
                i++;
            }else {
                keepstr = "";
                while((i<str.length())&&(ch = str.charAt(i))>=48&&(ch = str.charAt(i))<=57) {
                    keepstr += ch;
                    i++;
                }
                ls.add(keepstr);
            }
        }while(i<str.length());
        return ls;

    }
}
class Equal {
    public int equalOperation(String s) {
        int res  = 0;
        switch (s){
            case "+":
                res = 1;
                break;
            case "-":
                res = 1;
                break;
            case "*":
                res = 2;
                break;
            case "/":
                res = 2;
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}