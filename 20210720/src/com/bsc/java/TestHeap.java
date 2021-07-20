package com.bsc.java;

import java.lang.reflect.Array;
import java.util.*;

public class TestHeap {
    byte[] bytes = new byte[new Random().nextInt(1024*200)];
    public static void main(String[] args)  {
        ArrayList<TestHeap> list = new ArrayList<>();
        System.out.println("线程启动~");

        while (true){
            list.add(new TestHeap());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
