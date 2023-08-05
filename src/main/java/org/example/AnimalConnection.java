package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AnimalConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Marina2009";

    private static Connection connection;


    public static Connection getConnection() {
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        }catch (SQLException e){
            e.printStackTrace();
        }

        return connection;
    }
    public static void closeConnection(){
        try{
            connection.close();
        }catch (SQLException e ){
            System.err.println("Не удалось закончить соединение с бд!");
        }
    }
}
