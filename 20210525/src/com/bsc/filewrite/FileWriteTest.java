package com.bsc.filewrite;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class FileWriteTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("bsc");
        arrayList.add("123");
        //System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
    @Test
    public void func01(){
        FileWriter fileWriter = null;
        String writerPath = "e://qw.txt";
        try {
            fileWriter = new FileWriter(writerPath);
            fileWriter.write('a');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void func02(){
        FileWriter fileWriter = null;
        String writerPath = "e://qw.txt";
        char[] chars = {'a','b'};
        try {
            fileWriter = new FileWriter(writerPath);
            fileWriter.write(chars);
            fileWriter.write("hello world");
            fileWriter.write("bsc".toCharArray(),0,3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
