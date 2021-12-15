package com.company;

import java.util.Arrays;

public class Ej4 {
    /*
        Crea dos funciones que trabajen com arrays de dos dimensiones:
    int[][] eliminarFilasPares(int[][] matriz) que devuelva el resultado de eliminar de matriz las filas pares
    int[][] eliminarFilasImpares(int[][] matriz) que devuelva el resultado de eliminar de matriz las filas impares
     */
    public static void main(String[] args) {
        int[][] matriz = {  {12, 23, 45, 56},
                            {11, 11, 99, 69},
                            {28, 75, 90, 10},
                            {21, 56, 32, 33}
        };

        for (int[] row:matriz) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row:eliminarFilasPares(matriz)) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row:eliminarFilasImpares(matriz)) {
            System.out.println(Arrays.toString(row));
        }

    }
    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][] resultadoPares;
        int tamMatriz = (matriz.length%2==0 ? matriz.length/2 : (matriz.length-1)/2);
        resultadoPares = new int[tamMatriz][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==1 || (i+1)%2==0){
                    resultadoPares[i][j] = matriz[i][j];
                }
            }
        }
        return resultadoPares;
    }
    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][] resultadoImpares;
        int tamMatriz = (matriz.length/2)+1;
        resultadoImpares = new int[tamMatriz][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultadoImpares = new int[tamMatriz][j];
                if(i==0 || (i+1)%2!=0){
                    resultadoImpares[i][j] = matriz[i][j];
                }
            }
        }

        return resultadoImpares;
    }
}
