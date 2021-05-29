package com.bsc.fileinputstream;


import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInPutStream_ {
    public static void main(String[] args) throws Exception {
            String path = "e:\\text.txt";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readUTF());
        System.out.println(objectInputStream.readObject());
    }
}
