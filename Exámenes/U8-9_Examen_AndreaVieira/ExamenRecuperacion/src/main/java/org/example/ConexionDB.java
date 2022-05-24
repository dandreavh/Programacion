package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    public static Connection con = null;

    public static Connection getConnection(){
            try {
                if(con == null){
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3366/ClassicModels?user=root&password=root"
                            + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return con;
    }

    public static void close(){
        try {
            if(con != null){
                con.close();
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
