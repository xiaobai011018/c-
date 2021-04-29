package com.bsc.uf;

import java.util.Scanner;

public class UfTest {
    public static void main(String[] args) {
        UF uf = new UF(5);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入你第一个要联合的数据");
            int i = sc.nextInt();
            System.out.println("请输入你第二个要联合的数据");
            int j = sc.nextInt();
            if (uf.connect(i,j)){
                System.out.println("数据已经在同一组了");
            }else {
                uf.union(i,j);
                System.out.println(uf.connect(i, j));
            }
        }
    }
}
