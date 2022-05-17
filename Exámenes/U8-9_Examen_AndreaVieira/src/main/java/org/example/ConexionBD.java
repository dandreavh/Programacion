package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static Connection con=null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3366/ClassicModels?user=root&password=root");
                System.out.println("Connection Successful");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return (con);
    }

    public static void close(){
        try {
            if (con != null) con.close();
        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}







