package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public static List<ProductLine> getProductLines(){
        Connection c = ConexionBD.getConnection();
        List<ProductLine> categorias = new ArrayList<>();

        try {
            PreparedStatement ps = c.prepareStatement("select * from productlines");

            ps.executeQuery();

            ResultSet resultado = ps.getResultSet();
            resultado.next();

            while (resultado.next()){
                ProductLine categoria = new ProductLine(resultado.getString(1), resultado.getString(2), resultado.getString(3), resultado.getString(4));
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categorias;
    }

    public static void categoriaMasVendida(){
        Connection c = ConexionBD.getConnection();
        // primera consulta
        PreparedStatement statement1; // creo el modelo
        try {
            statement1 = c.prepareStatement("SELECT e.officeCode " +
                    "FROM employees e " +
                    "GROUP BY e.officeCode " +
                    "ORDER BY COUNT(e.officeCode) DESC " +
                    "LIMIT 1");

            ResultSet rs1 = statement1.executeQuery(); // hago la consulta
            rs1.next(); // me quedo con el resultado de la primera fila
            int office = rs1.getInt(1); // guardo el resultado en variable

            // segunda consulta
            PreparedStatement statement2 = // creo el modelo
                    c.prepareStatement("SELECT * " +
                            "FROM employees e " +
                            "WHERE e.officeCode = ?");

            statement2.setInt(1, office); // relleno los interrogantes
            ResultSet rs2 = statement2.executeQuery(); // hago la consulta
            rs2.next(); // me quedo con la fila la fila

            // lo hago la primera vez para no perder la primera
            System.out.println("Empleado: " + rs2.getString(1) + " " + rs2.getString(2) + " " + rs2.getString(3) + " " + rs2.getString(4) + " " + rs2.getString(5) + " " + rs2.getString(6) + " " + rs2.getString(7) + " " + rs2.getString(8)); // imprimo el primero, que lo tengo cargado
            while (rs2.next()){
                // imprime desde el segundo
                System.out.println("---------------------------------");
                System.out.println("Empleado: " + rs2.getString(1) + " " + rs2.getString(2) + " " + rs2.getString(3) + " " + rs2.getString(4) + " " + rs2.getString(5) + " " + rs2.getString(6) + " " + rs2.getString(7) + " " + rs2.getString(8));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}