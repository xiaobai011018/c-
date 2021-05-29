package com.bsc.fileread;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
    public static void main(String[] args) {

    }
    @Test
    public void read01(){
        String readPath = "e://bsc.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader =  new FileReader(readPath);
            while((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
    @Test
    public void read02(){
        String readPath = "e://bsc.txt";
        FileReader fileReader = null;
        char[] chars = new char[8];
        try {
            fileReader =  new FileReader(readPath);
            while (fileReader.read(chars)!=-1){
                System.out.print(new String(chars,0,chars.length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
