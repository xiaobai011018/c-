package com.bsc.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class backspaceCompare {
    public static void main(String[] args) {
       System.out.println(backspaceCompare1("ab##", "c#d#"));
//        char c = "#".charAt(0);
//        System.out.println(c);


    }

    public static boolean backspaceCompare1(String s, String t) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                i-=2;
            }else{
                sb1.append(s.charAt(i));
            }
        }
        for(int i = t.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                i-=2;
            }else{
                sb2.append(s.charAt(i));
            }
        }
        return sb1.equals(sb2);
    }
    public static boolean backspaceCompare(String s, String t) {
        if(s==null&&t==null){
            return true;
        }
        if(s==null&&t!=null||s!=null&&t==null){
            return false;
        }
        ArrayList<Character> al1 = new ArrayList<>();
        ArrayList<Character> al2 = new ArrayList<>();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for(int i = 0;i<ch1.length;i++){
            al1.add(ch1[i]);
        }
        for(int i = 0;i<ch1.length;i++){
            al2.add(ch2[i]);
        }
        int num = 0;
        Iterator<Character> iterator = al1.iterator();
        while (iterator.hasNext()) {
            Character a =  iterator.next();
            if (a=='#'){
                if (num-1>=0){
                    al1.remove(num-1);
                }
                iterator.remove();
            }
            num++;
        }

        Iterator<Character> iterator1 = al2.iterator();
        while (iterator1.hasNext()) {
            Character a =  iterator1.next();
            if (a=='#'){
                if (num-1>=0){
                    al2.remove(num-1);
                }
                iterator.remove();
            }

        }
        if(al1.size()!=al2.size()){
            return false;
        }
        for(int i = 0;i<al1.size();i++){
            if(al1.get(i)!=al2.get(i)){
                return false;
            }
        }
        return true;
    }
}
