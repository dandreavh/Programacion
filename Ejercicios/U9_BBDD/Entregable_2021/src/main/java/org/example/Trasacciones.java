package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Trasacciones {

    public static void t1(){
        // Insertar una nueva oficina en Sevilla con dos nuevos empleados.
        // Insertar un nuevo cliente que esté relacionado con uno de los empleados de la oficina nueva.
        Connection c = ConnectionDB.getConnection(); // solo tengo que llamarlo

        try {
            c.setAutoCommit(false);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
