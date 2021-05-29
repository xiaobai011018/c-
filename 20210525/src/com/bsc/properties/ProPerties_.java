package com.bsc.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ProPerties_ {
    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
//        properties.load(new FileReader("src\\mysql.properties"));
//        properties.list(System.out);
//        String user = properties.getProperty("user");
//        System.out.println(user);
        Properties properties = new Properties();
        properties.setProperty("user","bsc");
        properties.setProperty("pwd","1234");
        properties.store(new FileWriter("src\\mysql.properties02"),null);
        System.out.println("文件配置成功");
    }
}
