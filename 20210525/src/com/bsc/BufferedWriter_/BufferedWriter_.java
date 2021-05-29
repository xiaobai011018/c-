package com.bsc.BufferedWriter_;

import com.bsc.BufferedReader_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "e:\\bsc.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write("柏诗成");
        bufferedWriter.close();
    }
}
