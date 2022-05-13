package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transacciones {

    public static void insert1(){
        // Insertar un nuevo cliente (customer) y dos pagos (payments) asociados a dicho cliente.
        Connection c = ConnectionDB.getConnection();
        Scanner sc = new Scanner(System.in);

        try {
            c.setAutoCommit(false);

            // pido los datos cliente
            System.out.println("1. customerNumber");
            int customerNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("2. customerName ");
            String name = sc.nextLine();
            System.out.println("3. contactLastName");
            String lastName= sc.nextLine();
            System.out.println("4. contactFirstName");
            String firstName= sc.nextLine();
            System.out.println("5. phone");
            String phone= sc.nextLine();
            System.out.println("6. addressLine1");
            String address1= sc.nextLine();
            System.out.println("7. addressLine2");
            String address2= sc.nextLine();
            System.out.println("8. city");
            String city= sc.nextLine();
            System.out.println("9. state");
            String state= sc.nextLine();
            System.out.println("10. postalCode");
            String postalCode= sc.nextLine();
            System.out.println("11. country");
            String country= sc.nextLine();
            System.out.println("12. salesRepEmployeeNumber");
            int numRepresante = sc.nextInt();
            System.out.println("13. creditLimit");
            double credit = sc.nextDouble();

            // pido datos pedidos
            System.out.println(" ------ PEDIDO 1 -------");
            System.out.println("1. orderNumber");
            int orderNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("2. orderDate");
            String orderDate = sc.nextLine();
            System.out.println("3. requiredDate");
            String requiredDate = sc.nextLine();
            System.out.println("4. shippedDate");
            String shippedDate = sc.nextLine();
            System.out.println("5. status");
            String status = sc.nextLine();
            System.out.println("5. comments");
            String comments = sc.nextLine();

            System.out.println(" ------ PEDIDO 2 -------");
            System.out.println("1. orderNumber");
            int orderNumber2 = sc.nextInt();
            sc.nextLine();
            System.out.println("2. orderDate");
            String orderDate2 = sc.nextLine();
            System.out.println("3. requiredDate");
            String requiredDate2 = sc.nextLine();
            System.out.println("4. shippedDate");
            String shippedDate2 = sc.nextLine();
            System.out.println("5. status");
            String status2 = sc.nextLine();
            System.out.println("5. comments");
            String comments2 = sc.nextLine();

            // hago los modelos
            PreparedStatement ps = c.prepareStatement("INSERT INTO customers VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement ps2 = c.prepareStatement("INSERT INTO orders VALUES (?,?,?,?,?,?,?)");
            PreparedStatement ps3 = c.prepareStatement("INSERT INTO orders VALUES (?,?,?,?,?,?,?)");

            // relleno los interrogante de cliente
            ps.setInt(1, customerNumber);
            ps.setString(2, name);
            ps.setString(3, lastName);
            ps.setString(4, firstName);
            ps.setString(5, phone);
            ps.setString(6, address1);
            ps.setString(7, address2);
            ps.setString(8, city);
            ps.setString(9, state);
            ps.setString(10, postalCode);
            ps.setString(11, country);
            ps.setInt(12, numRepresante);
            ps.setDouble(13, credit);

            // relleno los interrogante de order1
            ps2.setInt(1, orderNumber);
            ps2.setString(2, orderDate);
            ps2.setString(3, requiredDate);
            ps2.setString(4, shippedDate);
            ps2.setString(5, status);
            ps2.setString(6, comments);
            ps2.setInt(7, customerNumber);

            // relleno los interrogante de order2
            ps3.setInt(1, orderNumber2);
            ps3.setString(2, orderDate2);
            ps3.setString(3, requiredDate2);
            ps3.setString(4, shippedDate2);
            ps3.setString(5, status2);
            ps3.setString(6, comments2);
            ps3.setInt(7, customerNumber);

            ps.executeUpdate(); // ejecuto
            ps2.executeUpdate(); // ejecuto
            ps3.executeUpdate(); // ejecuto

            c.commit(); // hago la carga

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try{
                if (c!=null){
                    c.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }
    }

    public static void insert2(){
        // Insertar una nueva oficina en Tokyo y trasladar todos los empleados de Tokyo a la nueva oficina.
        Connection c = ConnectionDB.getConnection();
        Scanner sc = new Scanner(System.in);

        try {
            c.setAutoCommit(false);

            // pido los datos de office
            System.out.println("1. officeCode");
            String officeCode = sc.nextLine();
            System.out.println("2. city ");
            String city = sc.nextLine();
            System.out.println("3. phone");
            String phone= sc.nextLine();
            System.out.println("4. addressLine1");
            String addressLine1= sc.nextLine();
            System.out.println("5. addressLine2");
            String addressLine2= sc.nextLine();
            System.out.println("6. state");
            String state= sc.nextLine();
            System.out.println("7. country");
            String country= sc.nextLine();
            System.out.println("8. postalCode");
            String postalCode= sc.nextLine();
            System.out.println("9. territory");
            String territory= sc.nextLine();


            // hago los modelos
            PreparedStatement ps = c.prepareStatement("INSERT INTO offices VALUES (?,?,?,?,?,?,?,?,?)");
            PreparedStatement ps2 = c.prepareStatement("UPDATE employees\n " +
                    "SET officeCode = ?" +
                    "WHERE officeCode = (SELECT o.officeCode " +
                    "FROM offices o " +
                    "WHERE o.city = 'Tokyo')");

            // relleno los interrogante de cliente
            ps.setString(1, officeCode);
            ps.setString(2, city);
            ps.setString(3, phone);
            ps.setString(4, addressLine1);
            ps.setString(5, addressLine2);
            ps.setString(6, state);
            ps.setString(7, country);
            ps.setString(8, postalCode);
            ps.setString(9, territory);

            // relleno interrogante update
            ps2.setString(1, officeCode);

            ps.executeUpdate(); // ejecuto
            ps2.executeUpdate(); // ejecuto

            c.commit(); // hago la carga

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try{
                if (c!=null){
                    c.rollback();
                }
            } catch (SQLException throwables){
                System.out.println("Error en el rollback");
                throwables.printStackTrace();
            }
        }

    }
}
