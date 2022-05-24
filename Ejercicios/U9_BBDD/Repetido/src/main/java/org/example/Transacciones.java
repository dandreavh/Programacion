package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public static void insertarPedido(){
        Connection c = ConexionBD.getConnection();
        try {
            c.setAutoCommit(false);
            PreparedStatement ps = c.prepareStatement("insert into orders values (?,?,?,?,?)");

            ps.setInt(1, 34);
            ps.setString(2, "dssdf"); // etc

            ps.executeUpdate();

            c.commit();
        } catch (SQLException e) {
            try {
                c.rollback();
            } catch (SQLException ex) {
                System.out.println("error en rollback");
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }

    }
}
