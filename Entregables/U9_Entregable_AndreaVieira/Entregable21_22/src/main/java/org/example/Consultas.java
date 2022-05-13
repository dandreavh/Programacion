package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Consultas {
    public static void empleadosOficinaMayor(){
        //  mostrará por pantalla todos los datos de los empleados
        //  que trabajan en la oficina que tiene más empleados.
        Connection c = ConnectionDB.getConnection(); // solo tengo que llamarlo
        try {
            // primera consulta
            PreparedStatement statement1 = // creo el modelo
                    c.prepareStatement("SELECT e.officeCode " +
                            "FROM employees e " +
                            "GROUP BY e.officeCode " +
                            "ORDER BY COUNT(e.officeCode) DESC " +
                            "LIMIT 1");

            ResultSet rs1 = statement1.executeQuery(); // hago la consulta
            rs1.next(); // pido fila
            int office = rs1.getInt(1); // vuelvo en variable

            // segunda consulta
            PreparedStatement statement2 = // creo el modelo
                    c.prepareStatement("SELECT * " +
                            "FROM employees e " +
                            "WHERE e.officeCode = ?");

            statement2.setInt(1, office); // relleno los interrogantes
            ResultSet rs2 = statement2.executeQuery(); // hago la consulta
            rs2.next(); // pido la fila

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

    public static void productosNoVendidos(){
        // mostrará los datos de los productos que no han sido incluidos en ningún pedido.
        Connection c = ConnectionDB.getConnection(); // solo tengo que llamarlo
        try {
            // primera consulta
            PreparedStatement statement = // creo el modelo
                    c.prepareStatement("SELECT p.* " +
                            "FROM products p " +
                            "WHERE p.productCode NOT IN (SELECT o.productCode " +
                            "FROM orderdetails o)");

            ResultSet rs = statement.executeQuery(); // hago la consulta
            rs.next(); // pido la fila

            System.out.println("Producto: " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9)); // imprimo el primero, que lo tengo cargado
            while (rs.next()){
                // imprime desde el segundo
                System.out.println("---------------------------------");
                System.out.println("Producto: " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " " + rs.getString(9));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void informeCategoria(){
        // solicitará al usuario el nombre de una categoría (productLine) determinada y
        // mostará el nombre de todos los productos de dicha categoría así como las unidades vendidas para cada uno de esos productos y el total de todas esas unidades.
        Connection c = ConnectionDB.getConnection(); // solo tengo que llamarlo
        Scanner sc = new Scanner(System.in);
        String categoria;
        int total = 0;
        System.out.println("Indique la categoría -productLine - ej: Planes");
        categoria = sc.nextLine();

        try {
            PreparedStatement statement = // creo el modelo
                    c.prepareStatement("SELECT p.productName, o.quantityOrdered " +
                            "FROM products p INNER JOIN orderdetails o " +
                            "ON p.productCode = o.productCode " +
                            "WHERE p.productLine = ?");

            statement.setString(1, categoria); // relleno los interrogantes
            ResultSet rs = statement.executeQuery(); // hago la consulta

            rs.next();
            System.out.println("Producto: " + rs.getString(1) + " vendidos: " + rs.getInt(2));
            total = rs.getInt(2);
            while (rs.next()){
                // imprime desde el segundo
                // como tengo dos columnas en el resultado de la consulta, indico las posiciones 1 y 2
                System.out.println("Producto: " + rs.getString(1) + "\n       vendidos: " + rs.getInt(2));
                total++;
            }
            System.out.println("Total final: " + total);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
