package com.bsc.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.Callable;

@SuppressWarnings({"all"})
public class jdbcconn {

    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/bsc_db03";
        Properties properties = new Properties();
        properties.setProperty("uer","root");
        properties.setProperty("password","bsc");
        Connection connect = driver.connect(url, properties);
    }
    @Test
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/bsc_db03";
        Properties properties = new Properties();
        properties.setProperty("uer","root");
        properties.setProperty("password","bsc");
        Connection connect = driver.connect(url, properties);
    }
    @Test
    public void connect03() throws SQLException, ClassNotFoundException {
        //使用反射加载Driver
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = new Driver();
        //创建url 和 user 和password
        String url = "jdbc:mysql://localhost:3306/bsc_db03";
        String user = "root";
        String password = "bsc";
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第三种方式");
    }
    @Test
    public void connect04() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/bsc_db03";
        String user = "root";
        String password = "bsc";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("第三种方式");
    }
    @Test
    public void connect05() throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.proper"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        Class.forName(driver);
        System.out.println("第五种方式");

    }
//    @Test
//    public void connect05() throws IOException, ClassNotFoundException {
//        Properties properties = new Properties();
//        properties.load(new FileInputStream("src\\mysql.proper"));
//        String user = properties.getProperty("user");
//        String password = properties.getProperty("password");
//        String driver = properties.getProperty("driver");
//        String url = properties.getProperty("url");
//        Class.forName(driver);
//        System.out.println("第五种方法");
//    }
}
