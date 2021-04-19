package com.bsc;

import java.util.Arrays;

@SuppressWarnings({"all"})
public class Sparsearray {
    public static void main(String[] args) {
        int[][] chessarray = new int[11][11];//表示
        chessarray[2][3] = 2;
        chessarray[1][3] = 1;
        chessarray[4][3] = 2;
        for (int i = 0; i < chessarray.length; i++) {
            for (int j = 0; j < chessarray[i].length; j++) {
                System.out.print(chessarray[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < chessarray.length; i++) {
            for (int j = 0; j < chessarray[i].length; j++) {
                if (chessarray[i][j]!=0) {
                    sum++;
                }
            }
        }
        int count = 0;
        int[][] newarray = new int[sum+1][3];
        newarray[0][0] = chessarray.length;
        newarray[0][1] = chessarray[0].length;
        newarray[0][2] = sum;
        for (int i = 0; i < chessarray.length; i++) {
            for (int j = 0; j < chessarray[i].length; j++) {
                if (chessarray[i][j]!=0) {
                    count++;
                    newarray[count][0] = i;
                    newarray[count][1] = j;
                    newarray[count][2] = chessarray[i][j];
                }
            }
        }
        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length; j++) {
                System.out.print( newarray[i][j]+" ");
            }
            System.out.println();
        }
        int[][] newchessarray = new int[newarray[0][0]][newarray[0][1]];
        for (int i = 1; i < newarray.length ; i++) {
            newchessarray[newarray[i][0]][newarray[i][1]] = newarray[i][2];
        }
        for (int i = 0; i < newchessarray.length; i++) {
            for (int j = 0; j < newchessarray[i].length; j++) {
                System.out.print( newchessarray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
