package com.bsc.jdbc.statement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
@SuppressWarnings({"all"})
public class Statement_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String admin_name = scanner.nextLine();
        System.out.print("请输入密码:");
        String admin_paw = scanner.nextLine();
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.proper"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from admin where name = '" + admin_name + "' and pwd = '" + admin_paw + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
