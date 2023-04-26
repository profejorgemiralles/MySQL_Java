package com.mycompany.mysql_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_Insert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/school";
        String username = "root";
        String password = "root";
        
     
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            String deleteQuery = "DELETE FROM students WHERE id = 7";
            int rowsAffected = stmt.executeUpdate(deleteQuery);
            System.out.println(rowsAffected + " row(s) deleted.");
            
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
