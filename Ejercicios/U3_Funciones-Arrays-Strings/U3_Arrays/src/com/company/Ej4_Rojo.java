package com.company;

import java.util.Arrays;

public class Ej4_Rojo {
    // Crear una función unirMatrices que reciba dos matrices bidimensionales de cadenas y
    // devuelva la unión de las dos matrices.
    //Si la matrices no tiene la misma dimensión deberá devolver un vector bidimensional vacio.
    public static void main(String[] args) {
        String[][] matriz1 = new String[2][2];
        String[][] matriz2 = new String[2][2];

        for (String [] row: unirMatrices(matriz1, matriz2)) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static String[][] unirMatrices(String[][] m1,String[][] m2){
        String[][] union = new String[m1.length+ m2.length][m1[0].length+m2[0].length];
        if (m1.length==m2.length && m1[0].length==m2[0].length){
            for (int i = 0; i < m1.length; i++) {
                
            }

        } else{

        }
        return union;
    }
}
