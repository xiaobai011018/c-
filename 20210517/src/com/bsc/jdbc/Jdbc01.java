package com.bsc.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        Driver driver = new Driver();
        //得到链接
        String url = "jdbc:mysql://localhost:3306/bsc_db03";
        //将用户名和密码放到properties对象
        Properties properties = new Properties();
        properties.setProperty("uer","root");
        properties.setProperty("password","bsc");
        Connection connect = driver.connect(url, properties);
        //执行sql语句
        String sql = "delete from actor where id = 1";
        //String sql = "update actor set name = '张三丰' where id = 1";
        //String sql = "insert into actor values(null,'刘德华','男','1970-11-11','110')";
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i>0?"成功":"失败");
        statement.close();
        connect.close();
    }
}
