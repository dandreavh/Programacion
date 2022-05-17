package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Consultas {
    /*
    List<ProductLine> getProductLines() que devuelve una lista de productLines que se obtiene
    de la base de datos  y que será utilizada para
    mostrar toda esa información en pantalla en el Main

    CategoriaMasVendida() que muestra el nombre de la categoría que ha vendido más unidades
    de los productos pertenecientes a dicha categoría.
     */

    public static List<ProductLine> getProductLines(){
        Connection c = ConexionBD.getConnection();
        List<ProductLine> productLines = null;

        try {
            PreparedStatement ps = c.prepareStatement("select * from ?");
            ps.setString(1, "productlines");

            ResultSet rs = ps.executeQuery();
            rs.next();
            ProductLine p = new ProductLine(rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4));

            productLines.add(p);

            while (rs.next()){
                ProductLine pl = new ProductLine(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));

                productLines.add(pl);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return productLines;
    }

    public static void categoriaMasVendida(){
        Connection c = ConexionBD.getConnection();

        try {
            PreparedStatement ps = c.prepareStatement("SELECT ? \n" +
                    "FROM ? INNER JOIN ? \n" +
                    "ON p.productLine  = p2.productLine \n" +
                    "WHERE ? = (SELECT o.productCode \n" +
                    "FROM orderdetails o \n" +
                    "group by o.productCode\n" +
                    "ORDER BY SUM(o.quantityOrdered) DESC \n" +
                    "Limit 1)");

            ps.setString(1, "p.productLine");
            ps.setString(2, "productlines p");
            ps.setString(3, "products p2");
            ps.setString(4, "p2.productCode");

            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println("Categoría más vendida: " + rs.getString(1));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
