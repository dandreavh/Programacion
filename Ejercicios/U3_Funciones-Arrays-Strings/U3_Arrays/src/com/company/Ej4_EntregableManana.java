package com.company;

import java.util.Arrays;

public class Ej4_EntregableManana {
    // Realiza un programa que rellene un array de 5 filas por 9 columnas con
    //números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
    //continuación, el programa deberá dar la posición tanto del máximo como del
    //mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.
    public static void main(String[] args) {
        int[][] tabla = new int[5][9];
        int[] todos = new int[0];
        int mayor = 0;
        int menor = 1000;
        String posicionMayor = "";
        String posicionMenor = "";
        int num;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                do{
                    num = (int) (Math.random()*(1001-100)+100);
                } while (esta(tabla, num));

                tabla[i][j] = num;

                if(tabla[i][j]>mayor){
                    mayor = tabla[i][j];
                    posicionMayor = i + "," + j;
                } else if (tabla[i][j]<menor){
                    menor = tabla[i][j];
                    posicionMenor = i + "," + j;
                }
            }
        }

        for (int[] row:tabla) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("El mayor es: " +mayor+ " y está en la posición " +posicionMayor );
        System.out.println("El menor es: " +menor+ " y está en la posición " +posicionMenor );

        //System.out.println(Arrays.toString(todos));
        //todos = Arrays.copyOf(todos, todos.length+1);
        //todos[todos.length-1] = tabla[i][j];

    }

    public static boolean esta(int[][] tabla, int num) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if(tabla[i][j]==num){
                    return true;
                }
            }
        }
        return false;
    }
}
