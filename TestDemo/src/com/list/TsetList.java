package com.list;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class TsetList {
    public static void main(String[] args) {
     List list = new ArrayList();
     list.add(new Book("三国",45,"qwe"));
     list.add(new Book("文案",15,"q12"));
     list.add(new Book("青蛙",16,"q3"));
//        for (Object o :list) {
//            System.out.println(o);
//        }
        sort(list);
        for (Object o :list) {
            System.out.println(o);
        }
    }
    public static void sort(List list) {
        int sz = list.size();
        for (int i = 0; i < sz-1; i++) {
            for (int j = 0; j < sz-1-i; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice()>book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }


}

