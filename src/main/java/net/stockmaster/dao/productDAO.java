package net.stockmaster.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class productDAO {
    // Database credentials
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/stockmasterbrf1?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USERNAME = "root";  
    private static final String JDBC_PASSWORD = "admin"; 

    // Method to establish database connection
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check database credentials.");
            e.printStackTrace();
        }
        return connection;
    } }

    
