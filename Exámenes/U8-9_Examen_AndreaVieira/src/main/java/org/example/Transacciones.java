package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    // insertarPedido() que un pedido con dos productos para un cliente.
    // Los dos datos necesarios del cliente y de los productos podemos obtenerlos de la base de datos.

    public static void insertarPedido(){
        Connection c = ConexionBD.getConnection();

        try {
            c.setAutoCommit(false);

            PreparedStatement ps = c.prepareStatement("insert into orders values(?,?,?,?,?,?,?)");
            PreparedStatement ps2 = c.prepareStatement("insert into orderdetails values(?,?,?,?,?)");
            PreparedStatement ps3 = c.prepareStatement("insert into orderdetails values(?,?,?,?,?)");

            ps.setInt(1, 99999);
            ps.setString(2,"2022-05-17");
            ps.setString(3,"2022-05-17");
            ps.setString(4,"2022-05-17");
            ps.setString(5,"shipped");
            ps.setString(5,"comments");
            ps.setInt(7, 103);

            ps2.setInt(1, 99999);
            ps2.setString(2, "S10_1678");
            ps2.setInt(3, 2);
            ps2.setDouble(4, 2500.00);
            ps2.setInt(5, 999999);


            ps3.setInt(1, 99999);
            ps3.setString(2, "S18_1129");
            ps3.setInt(3, 2);
            ps3.setDouble(4, 2500.00);
            ps3.setInt(5, 999999);

            ps.executeUpdate();
            ps2.executeUpdate();
            ps3.executeUpdate();

            c.commit();
        } catch (SQLException e) {
            try {
                c.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
