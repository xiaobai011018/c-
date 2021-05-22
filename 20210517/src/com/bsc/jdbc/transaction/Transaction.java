package com.bsc.jdbc.transaction;

import com.bsc.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
    @Test
    public void testTransaction(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql1 = "Update actor set name = 'abc' where id = 4";
        String sql2 = "Update actor set name = 'ade' where id = 2";
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.executeUpdate();
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.Close(null,connection,preparedStatement);
        }
    }
}
