package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    /*
    insertarPedido() que un pedido con dos productos para un cliente.
    Los dos datos necesarios del cliente y de los productos podemos obtenerlos de la base de datos.
     */
    public static void insertarPedido(){
        Connection c = ConexionBD.getConnection();

        try {
            c.setAutoCommit(false); // IMPORTANTE

            // MODELO 1
            PreparedStatement ps1 = c.prepareStatement("INSERT INTO orders \n" +
                                                            "VALUES(?,?,?,NULL,?,NULL,?);");
            // RELLENO DATOS
            ps1.setInt(1, 20000);
            ps1.setString(2, "2022-05-16");
            ps1.setString(3, "2022-05-17");
            ps1.setString(4, "Shipped");
            ps1.setInt(5, 119);     // Código del cliente

            // MODELO 2
            PreparedStatement ps2 = c.prepareStatement("INSERT INTO orderdetails\n" +
                                                            "VALUES(?,?,?,?,?),\n" +
                                                            "\t(?,?,?,?,?);");
            // RELLENO DATOS
            ps2.setInt(1, 20000);
            ps2.setString(2, "S10_1678");
            ps2.setInt(3, 5);
            ps2.setInt(4, 100);
            ps2.setInt(5, 1);

            ps2.setInt(6, 20000);
            ps2.setString(7, "S10_1949");
            ps2.setInt(8, 10);
            ps2.setInt(9, 90);
            ps2.setInt(10, 2);

            // EJECUTO Y MUESTRO PARA CONFIRMAR
            System.out.println(ps1.executeUpdate());
            System.out.println(ps2.executeUpdate());

            // HAGO EL COMMIT PARA QUE SE HAGAN TODOS
            c.commit();
        } catch (SQLException e) {
            System.out.println(e);
            try {
                c.rollback();
            } catch (SQLException ex) {
                System.out.println("Error en el rollback " + ex);
            }
        }
    }
}
