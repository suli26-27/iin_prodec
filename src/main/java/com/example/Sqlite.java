package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite implements Database {

    @Override
    public Connection connect() {
        try {
            return tryConnect();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    private Connection tryConnect() throws SQLException {
        String url = "jdbc:sqlite:database.db";
        return DriverManager.getConnection(url);
    }
    
}
