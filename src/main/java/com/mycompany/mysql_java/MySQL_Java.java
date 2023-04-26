package com.mycompany.mysql_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_Java {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/school";
        String username = "root";
        String password = "root";
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            String query = "SELECT id, name FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                int id = rs.getInt("id");
                
                System.out.println("Id:" + id + " Name: " + name);
            }
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
