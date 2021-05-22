package com.bsc.jdbc.Druid;

import com.bsc.jdbc.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import javax.xml.ws.handler.Handler;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SuppressWarnings({"all"})
public class Dbutils_user {
    @Test
    public void testQuerry() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id>=?";
        List<Actor> query = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
        for (Actor actor:query) {
            System.out.print(actor);
        }
        JDBCUtilsByDruid.close(null,null,connection);
    }
    @Test
    public void testSingleQuerry() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id=?";
        Actor query = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 2);
        System.out.println(query);
        JDBCUtilsByDruid.close(null,null,connection);
    }
    @Test
    public void testSingleRow() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select name from actor where id=?";
        Object query = queryRunner.query(connection, sql, new ScalarHandler(), 2);
        System.out.println(query);
        JDBCUtilsByDruid.close(null,null,connection);
    }
    @Test
    public void testCRUD() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "update actor set name = ? where id = ?";
        int effectedrows = queryRunner.update(connection,sql, "王五", 2);
        System.out.println(effectedrows>0?"执行成功":"执行失败");
        JDBCUtilsByDruid.close(null,null,connection);
    }

}
