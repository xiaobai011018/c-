package com.bsc.fileoutputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExercise {
    public static void main(String[] args) {

    }
    @Test
    public void func(){
        String str = "e://bsc.txt";
        FileOutputStream fileOutputStream = null;
        String name = "heall,world";
        try {
            fileOutputStream = new FileOutputStream(str,true);
            fileOutputStream.write(name.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
