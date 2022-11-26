package com.example.i200444_i200518_project;

import java.sql.*;

public class DBHelper {
    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/guild_db", "root", "root");
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

    public User login(User user) {
        try {
            Connection con = getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users where user_name = '" + user.getUsername() + "' and password = '" + user.getPassword() + "'");
            if (resultSet.next()){
                User user1 = new User(resultSet.getString("user_name"), resultSet.getString("cnic"), resultSet.getString("password"), resultSet.getString("roll_number"), resultSet.getString("user_type"));
                return user1;
            }
            else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
