package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    /*
    List<ProductLine> getProductLines() que devuelve una lista de productLines que
    se obtiene de la base de datos  y que será utilizada para mostrar toda esa
    información en pantalla en el Main

CategoriaMasVendida() que muestra el nombre de la categoría que ha vendido
más unidades de los productos pertenecientes a dicha categoría.
     */

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
}
