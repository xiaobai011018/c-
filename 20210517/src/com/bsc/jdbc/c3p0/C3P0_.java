package com.bsc.jdbc.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import jdk.nashorn.internal.ir.CallNode;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class C3P0_ {
    @Test
    public void testC3P0_01() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.proper"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setInitialPoolSize(10);
        comboPooledDataSource.setMaxPoolSize(50);
        System.out.println("开始连接");
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long l1 = System.currentTimeMillis();
        System.out.println("共用时"+(l1-l));
    }
    @Test
    public void testC3P0_02() throws SQLException {
        ComboPooledDataSource bsc = new ComboPooledDataSource("bsc");
        System.out.println("开始连接");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = bsc.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("连接成功" + (end-start));
    }
}
