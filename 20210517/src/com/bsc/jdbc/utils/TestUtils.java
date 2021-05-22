package com.bsc.jdbc.utils;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class TestUtils {
    @Test
    public void testSelect(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "select * from actor ";
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int anInt = resultSet.getInt(1);
                String string = resultSet.getString(2);
                String string1 = resultSet.getString(3);
                Date date = resultSet.getDate(4);
                System.out.println(anInt+string+string1+date);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.Close(resultSet,connection,preparedStatement);
        }
    }
    @Test
    public  void Test() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "Update actor set name = ? where id = ?";
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1,"周星驰");
           preparedStatement.setInt(2,4);
           preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.Close(null,connection,preparedStatement);
        }
    }
}
