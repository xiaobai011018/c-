package com.bsc.jdbc.resultset;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
@SuppressWarnings({"all"})
public class ResultSet_ {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.proper"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into actor values(null,'王五','男','1940-1-3','1234')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }
    public static void main1(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.proper"));
        String uesr = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, uesr, password);
        Statement statement = connection.createStatement();
        String sql = "select id,name,sex,borndate from actor";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()!=false){
            int anInt = resultSet.getInt(1);
            String string = resultSet.getString(2);
            String string1 = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(anInt+"\t"+string+"\t"+string1+"\t"+date);
        }
//        Class.forName("")

    }
}