package com.bsc.jdbc.Druid;

import com.bsc.jdbc.utils.JDBCUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
@SuppressWarnings({"all"})
public class Test {
    @org.junit.jupiter.api.Test
    public void test() throws IOException, ClassNotFoundException, SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        String sql = "select id,name,sex,borndate from actor";
        Statement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Actor> list = new ArrayList<>();
        while(resultSet.next()!=false){
            int anInt = resultSet.getInt(1);
            String string = resultSet.getString(2);
            String string1 = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            list.add(new Actor(anInt,string,string1,date));
        }
        System.out.println(list);
        JDBCUtils.Close(resultSet,connection,statement);
    }
}
