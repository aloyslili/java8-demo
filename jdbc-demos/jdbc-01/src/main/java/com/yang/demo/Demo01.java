package com.yang.demo;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
         * 1. IP
         * 2. PORT
         * 3. 数据库名
         * 4. 用户名
         * 5. 密码
         * 6. 其他配置
         */
        // JDBC：java databases connectivity

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://47.106.203.81:3306/ry-vue",
                "root",
                "Yang@2008"
        );

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from sys_menu");
        // resultSet.next(); // 即将读取下一行的数据

        while(resultSet.next()) {
            String menuName = resultSet.getString("menu_name");
            System.out.println(menuName);
        }

        connection.close();

    }
}
