package com.bsc.eightqueens;

public class EightQueens {
    final static int max = 8;
    private static int[] array = new int[max];

    public static void main(String[] args) {


        EightQueens eightQueens = new EightQueens();
        eightQueens.check(0);
    }
    public  void check(int n) {
        if (n==max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n+1);
            }
        }
    }
    public boolean judge(int n) {

        for (int i = 0; i < n; i++) {
            if (array[i]==array[n] || Math.abs(n-i)==Math.abs(array[i]-array[n])) {
                return false;
            }
        }
       return true;
    }
    private  void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
