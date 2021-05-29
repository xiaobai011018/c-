package com.bsc;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        File file = new File("e:\\text.txt");
         file.createNewFile();

    }
    @Test
    public void func2(){
        File file = new File("e:\\","text02.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void func3(){
        File file = new File("e://demo//a//b");
        if (file.exists()){
            System.out.println("文件存在");
        }else {
            if(file.mkdirs()){
                System.out.println("文件创建成功");
            }else {
                System.out.println("文件创建失败");
            }
        }
    }
}
