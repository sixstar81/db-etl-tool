package com.sk.etl;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class userTest {

    @Test
    void findUser() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@118.217.227.148:1521:xe", "sixstar6", "sixstar6");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        System.out.println(connection);

    }
}
