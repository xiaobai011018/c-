package com.bsc.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutPutStream_ {
    public static void main(String[] args) throws Exception {
        String outPath = "e:\\text.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(outPath));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeUTF("bsc");
        objectOutputStream.writeObject(new Dog("张三",12));
        objectOutputStream.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
