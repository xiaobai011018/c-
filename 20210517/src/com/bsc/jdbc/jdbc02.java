package com.bsc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bsc_db03";
        String user = "root";
        String password = "bsc";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "delete from news where id = 3";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }
}
