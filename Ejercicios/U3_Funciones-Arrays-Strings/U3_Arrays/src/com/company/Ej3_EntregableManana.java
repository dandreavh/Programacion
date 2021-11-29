package com.company;

import java.util.Arrays;

public class Ej3_EntregableManana {
    // Implementa una función con nombre corteza que sea capaz de extraer la capa
    //exterior de un array bidimensional. Esta capa se extrae en forma de array de
    //una dimensión. La extracción de números comienza en la esquina superior
    //izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
    //tanto el código de la función como el código de prueba que la usa. La cabecera
    //de la función es la siguiente:
    //
    //public static int[] corteza(int[][] n)
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = (int) (Math.random()*(10-0)+0);
            }
        }

        for (int[] row:tabla) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(" ");

        System.out.println("La corteza sería: ");
        System.out.println(corteza(tabla));
    }
    public static int[] corteza(int[][] n){
        int[] resultado = new int[0];
        for (int i = 0; i < n.length; i++) {
            resultado = Arrays.copyOf(resultado,resultado.length+1);
            //resultado[resultado.length-1] = n[i];
        }

        return resultado;
    }
}
