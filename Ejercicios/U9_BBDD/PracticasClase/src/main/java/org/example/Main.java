package org.example;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            //Creo la conexión a la base de datos
            // La paso el nombre de la base de datos classimodels
            // El usuario de la base de datos user=usuario
            // La contraseña password=usuario
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3366/ClassicModels?user=root&password=root");

            //Creo el objeto para ejecutar la sentencias SQL
            Statement statement = connection.createStatement();

            //Establezco un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery("select * from products");

            //Recorremos el conjunto de resultados

            // SACAMOS PRODUCTOS Y CATEGORÍA

            /*
            while (rs.next()) {
                //Obtenemos un campo cadena
                System.out.println("productName :" + rs.getString("productName"));
                //Obtenemos un campo de tipo entero
                System.out.println("productLine :" + rs.getString("productLine"));
                System.out.println("-----------------");
            }
             */


            // con un codigo de cliente devolver la suma de todos los pagos

            /*
            int codClient;

            System.out.println("Indique el código del cliente");
            codClient = sc.nextInt();

            ResultSet rs2 = statement.executeQuery("select sum(amount) from payments where customerNumber="+codClient);
            rs2.next();
            System.out.println("El cliente " + codClient + " ha pagado en total " + rs2.getDouble(1) + "€");

             */

            // mostrar empleados de una oficina dada

            Scanner sc = new Scanner(System.in);

            System.out.println("Indique el código de la office");
            String codOffice = sc.nextLine();

            // creo la plantilla de la consulta
            String query = "select * from employees where officeCode = ? ";
            PreparedStatement st = connection.prepareStatement(query);

            // añado el valor a la columna que necesito
            st.setString(1,codOffice);

            ResultSet result = st.executeQuery();

            while (result.next()){
                System.out.println("Empleado: " + result.getString(2) + " "+ result.getString(3));
                System.out.println("--------------------");
            }

            /*
            //Recorremos el conjunto de resultados
            while (rs.next()) {
                //Obtenemos un campo cadena
                System.out.println("CustomerName :" + rs.getString("customerName"));
                //Obtenemos un campo de tipo entero
                System.out.println("CustomerNumber :" + rs.getInt("customerNumber"));
                //Obtenemos un campo por posición
                System.out.println("Tercer campo :" + rs.getString(3));
                System.out.println("-----------------");
            }
             */


            // insertar una categoría

            String sql = "insert into productlines values(?,?,null,null) ";
            PreparedStatement myStatement = connection.prepareStatement(sql);

            String nombre;
            String descripcion;

            System.out.println("Nombre");
            nombre = sc.nextLine();
            System.out.println("Descripción");
            descripcion = sc.nextLine();

            // añado el valor a la columna que necesito
            myStatement.setString(1,nombre);
            myStatement.setString(2,descripcion);



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}