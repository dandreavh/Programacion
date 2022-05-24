package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    /*
    List<Product> getProducts(Double price) que devuelve una lista de productos cuyo precio sea
    menor que el precio que se le pasa como parámetro a la función.
     */

    public static List<Product> getProducts(Double price){
        Connection c = ConexionDB.getConnection();
        List<Product> allProducts = new ArrayList<>();
        Product producto = new Product();

        try {
            PreparedStatement ps = c.prepareStatement("SELECT *\n" +
                                                        "FROM products p \n" +
                                                        "WHERE p.buyPrice <= ?");
            ps.setDouble(1, price);


            ps.executeQuery();

            ResultSet rs = ps.getResultSet();
            rs.next();

            producto.setProductCode(rs.getString(1));
            producto.setProductName(rs.getString(2));
            producto.setProductLine(rs.getString(3));
            producto.setProductScale(rs.getString(4));
            producto.setProductVendor(rs.getString(5));
            producto.setProductDescription(rs.getString(6));
            producto.setQuantityInStock(rs.getInt(7));
            producto.setBuyPrice(rs.getDouble(8));
            producto.setMsrp(rs.getDouble(9));

            allProducts.add(producto);

            while (rs.next()){
                producto.setProductCode(rs.getString(1));
                producto.setProductName(rs.getString(2));
                producto.setProductLine(rs.getString(3));
                producto.setProductScale(rs.getString(4));
                producto.setProductVendor(rs.getString(5));
                producto.setProductDescription(rs.getString(6));
                producto.setQuantityInStock(rs.getInt(7));
                producto.setBuyPrice(rs.getDouble(8));
                producto.setMsrp(rs.getDouble(9));

                allProducts.add(producto);
            }
            System.out.println(allProducts);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return allProducts;
    }
}
