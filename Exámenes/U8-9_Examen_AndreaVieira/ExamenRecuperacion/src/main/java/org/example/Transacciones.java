package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    /*
    insertarOficina() que inserta una oficina y dos empleeados para esta nueva oficina.
     */

    public static void insertarOficina(){
        Connection c = ConexionDB.getConnection();

        try {
            c.setAutoCommit(false);

            PreparedStatement statementOficina = c.prepareStatement("INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)");
            statementOficina.setString(1, "11");
            statementOficina.setString(2, "Umbrete");
            statementOficina.setString(3, "655293400");
            statementOficina.setString(4, "Calle Nueva");
            statementOficina.setString(5, "S/N");
            statementOficina.setString(6, "Andalucia");
            statementOficina.setString(7, "Spain");
            statementOficina.setString(8, "41007");
            statementOficina.setString(9, "Sevilla");


            PreparedStatement statementEmpleado = c.prepareStatement("INSERT INTO employees VALUES (?,?,?,?,11,?,?,?)");
            statementEmpleado.setInt(1, 1111);
            statementEmpleado.setString(2, "Vieira");
            statementEmpleado.setString(3, "Andrea");
            statementEmpleado.setString(4, "1111");
            statementEmpleado.setString(5, "andrea@correo.com");
            statementEmpleado.setInt(6, 23);
            statementEmpleado.setString(7, "Web Developer");

            statementEmpleado.setInt(1, 2222);
            statementEmpleado.setString(2, "Lopez");
            statementEmpleado.setString(3, "Claudia");
            statementEmpleado.setString(4, "2222");
            statementEmpleado.setString(5, "claudia@correo.com");
            statementEmpleado.setInt(6, 23);
            statementEmpleado.setString(7, "Web Developer");

            System.out.println(statementOficina.executeUpdate());
            System.out.println(statementEmpleado.executeUpdate());

            c.commit();
        } catch (SQLException e) {
            try {
                c.rollback();
            } catch (SQLException ex) {
                System.out.println("Error en el rollback");
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }
    }
}
