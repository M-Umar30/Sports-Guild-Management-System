package com.example.i200444_i200518_project;

import java.sql.*;

public class DBHelper {
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/guild_schema", "root", "monsterofthegalaxy");
        return connection;
    }

    public void checker(){
        try {
            Connection con = getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getString(4));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void login(User user) {

    }
}
