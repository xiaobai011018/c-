package com.bsc.jdbc.utils;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class JDBCUtils {
    private static String user;
    private static String password;
    private static String driver;
    private static String url;
    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\mysql.proper"));
           user = properties.getProperty("user");
             password = properties.getProperty("password");
             driver = properties.getProperty("driver");
            url = properties.getProperty("url");
              Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection()  {
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }
    public static void Close(ResultSet set, Connection connection, Statement statement){
        {
            try {
                if (set!=null) {
                    set.close();
                }
                if (connection!=null){
                    connection.close();
                }
                if (statement!=null){
                    statement.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
