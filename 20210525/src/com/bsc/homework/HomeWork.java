package com.bsc.homework;

import java.io.*;
import java.util.Properties;

public class HomeWork {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String filePath = "e:\\q.txt";
        Properties properties = new Properties();
        properties.load(new FileReader("src\\dog.properties"));
        String name = properties.getProperty("name");
        String color = properties.getProperty("color");
        int age = Integer.parseInt(properties.getProperty("age")+"");
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("e:\\q.txt"));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("e:\\q.txt"));
        byte[] bytes = new byte[8];
        int length = 0;

            System.out.println(objectInputStream.readObject());
        objectInputStream.close();
//        String path = "e:\\mytemp\\hello.txt";
//        FileWriter fileWriter = new FileWriter(path);
//        fileWriter.close();\
//        String path = "e:\\bsc.sql";
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//        String line = "";
//        int l = 0;
//        while((line=bufferedReader.readLine())!=null){
//            System.out.println("第"+(++l)+"行"+"  "+ line);
//        }
//        System.out.println("读取完毕");
//        bufferedReader.close();
//        Properties properties = new Properties();
//        properties.setProperty("name","tom");
//        properties.setProperty("age","5");
//        properties.setProperty("color","red");
//        properties.store(new FileWriter("src\\dog.properties"),null);
//        String director = "e:\\mytemp";
//        File file = new File(director);
//        if (!file.exists()) {
//            if (file.mkdirs()) {
//                System.out.println("目录创建成功");
//            } else {
//                System.out.println("目录创建失败");
//            }
//        }
//        String filePath  = director+"\\bsc.txt";
//        file = new File(filePath);
//        if (!file.exists()){
//            if (file.createNewFile()){
//                System.out.println("文件创建成功");
//                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
//                bufferedWriter.write("hello world");
//                System.out.println("文件写入成功");
//                bufferedWriter.close();
//            }else {
//                System.out.println("文件创建失败");
//            }
//        }else {
//            System.out.println("文件存在");
//        }

    }
}
class Dog implements Serializable{
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    int age;
    String color;

}