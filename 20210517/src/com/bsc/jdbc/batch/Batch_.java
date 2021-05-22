package com.bsc.jdbc.batch;

import com.bsc.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//interface A extends B{}
//class B{}
interface A{}
public class Batch_ {
    @Test
    public void Patch() throws SQLException {
        
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(?,?)";
        System.out.println("开始执行");
        long l = System.currentTimeMillis();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);;
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setInt(1,i);
            preparedStatement.setString(2,"bsc"+i);
            preparedStatement.addBatch();
            if ((i+1)%1000==0){
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println("普通操作用时:"+(l1-l));
        JDBCUtils.Close(null,connection,preparedStatement);
    }
    @Test
    public  void noPatch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(?,?)";
        System.out.println("开始执行");
        long l = System.currentTimeMillis();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);;
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setInt(1,i);
            preparedStatement.setString(2,"bsc"+i);
            preparedStatement.executeUpdate();
        }
        long l1 = System.currentTimeMillis();
        System.out.println("普通操作用时:"+(l1-l));
        JDBCUtils.Close(null,connection,preparedStatement);
    }
}
