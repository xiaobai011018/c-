package com.bsc.jdbc.preparestatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class homework {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        Scanner scanner = new Scanner(System.in);
//        String admin_name = scanner.nextLine();
//        String admin_pwd = scanner.nextLine();
        properties.load(new FileInputStream("src\\mysql.proper"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from admin";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1,admin_name);
//        preparedStatement.setString(2,admin_pwd);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            String string = resultSet.getString(1);
            String string1 = resultSet.getString(2);
            System.out.println(string+string1);
        }
        preparedStatement.close();
        connection.close();
    }
}
