package org.example;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
    public static void pagosCliente(){
        // muestre por pantalla el nombre del cliente (contactFirstName),
        // su apellido (contactLastName), país (country)  y
        // la suma de todos los pagos realizados por dicho cliente.
        // Esta consulta será realizada con un Statement.

        Connection c = ConnectionDB.getConnection(); // solo tengo que llamarlo

        Scanner sc = new Scanner(System.in);
        int customerNumber;
        System.out.println("Indique su customerNumber");
        customerNumber = sc.nextInt();

        try {
            Statement statement = c.createStatement();
            ResultSet result = statement.executeQuery("SELECT c.contactFirstName, c.contactLastName, c.country, SUM(p.amount) " +
                    "FROM customers c INNER JOIN payments p " +
                    "ON c.customerNumber = p.customerNumber " +
                    "WHERE c.customerNumber = " + customerNumber);

            System.out.println(result.toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } // mirar, no está

    public static void infoPedido(){
        // muestra por pantalla el nombre, precio y
        // cantidad de todos los productos incluídos en el pedido así como el coste total del mismo.
        // Está consulta será realizada con un PreparedStatement.
        int orderNumber;
        System.out.println("Indique su orderNumber");
        //  orderNumber = sc.nextInt();

    } // mirar, no está
    public static void datosJefe(){
        // muestra por pantalla el nombre(firstName) y los apellidos(lastName) de su jefe.
        // Está consulta será realizada con un PreparedStatement.
        Connection c = ConnectionDB.getConnection(); // solo tengo que llamarlo
        Scanner sc = new Scanner(System.in);
        int employeeNumber;
        System.out.println("Indique su employeeNumber");
        employeeNumber = sc.nextInt();

        try {
            PreparedStatement statement = // creo el modelo
                    c.prepareStatement("SELECT e2.firstName , e2.lastName " +
                    "FROM employees e INNER JOIN employees e2 " +
                    "ON e.reportsTo = e2.employeeNumber " +
                    "WHERE e.employeeNumber = ?");

            statement.setInt(1, employeeNumber); // relleno los interrogantes

            ResultSet rs = statement.executeQuery(); // hago la consulta

            rs.next(); // pido la fila

            // como tengo dos columnas en el resultado de la consulta, indico las posiciones 1 y 2
            System.out.println("Jefe: " + rs.getString(1) + " " + rs.getString(2));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    } // funciona

    // lista de empleados de la ciudad
    public static void listaEmpleadosXCiudad(){
        Connection c = ConnectionDB.getConnection(); // solo tengo que llamarlo
        Scanner sc = new Scanner(System.in);
        String city;
        System.out.println("Indique la ciudad");
        city = sc.nextLine();

        try {
            PreparedStatement statement = // creo el modelo
                    c.prepareStatement("SELECT e.firstName, e.lastName " +
                            "FROM employees e INNER JOIN offices o " +
                            "ON e.officeCode = o.officeCode " +
                            "WHERE o.city = ?");

            statement.setString(1, city); // relleno los interrogantes

            ResultSet rs = statement.executeQuery(); // hago la consulta

            if(!rs.next()){
                System.out.println("No hay empleados en " + city);
            } else{
                System.out.println("Empleado: " + rs.getString(1) + " " + rs.getString(2)); // imprimo el primero, que lo tengo cargado
                while (rs.next()){
                    // imprime desde el segundo
                    // como tengo dos columnas en el resultado de la consulta, indico las posiciones 1 y 2
                    System.out.println("Empleado: " + rs.getString(1) + " " + rs.getString(2));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
