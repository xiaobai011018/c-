package com.bsc.jdbc.preparestatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.Callable;

@SuppressWarnings({"all"})
public class PrepaerStatement {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        Scanner scanner = new Scanner(System.in);
        String admin_name = scanner.nextLine();
        String admin_pwd = scanner.nextLine();

        properties.load(new FileInputStream("src\\mysql.proper"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "delete from admin where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
       // preparedStatement.setString(1,admin_pwd);
        preparedStatement.setString(1,admin_name);
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        //ResultSet resultSet = preparedStatement.executeQuery();
//        if (resultSet.next()){
//            System.out.println("成功");
//        }else {
//            System.out.println("登陆失败");
//        }
    }
}
