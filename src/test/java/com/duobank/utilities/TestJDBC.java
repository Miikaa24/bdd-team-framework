package com.duobank.utilities;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {

        String url ="jdbc:mysql://db-duotech.cc652zs7kmja.us-east-2.rds.amazonaws.com/loan";
        String username = "duotech";
        String password ="duotech2022";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = statement.executeQuery("select* from tbl_user");
        resultSet.beforeFirst();
        resultSet.last();
        int rowNumbers = resultSet.getRow();
        System.out.println(rowNumbers);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int columnCount = resultSetMetaData.getColumnCount();
        System.out.println(columnCount);

        resultSet.beforeFirst();
        for (int i = 1; i <= rowNumbers; i++){
            resultSet.next();
            for (int j = 1; j <= columnCount; j++){
                System.out.println(resultSet.getString(j));
            }
            System.out.println();
        }

        statement.executeUpdate("update tbl_user set last_name='UPDATEDNAME' where id = 7506;");
        statement.executeUpdate("delete from tbl_user where id = 7504");

        resultSet.close();
        statement.close();
        connection.close();
    }
}
