package com.company;

import java.util.Arrays;

public class Actividad_5_extra {
    // Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios
    // entre 200 y 300. A continuación, el programa debe mostrar los números de la diagonal que va desde la esquinas
    // superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo y la media de los números que
    // hay en esa diagonal.
    public static void main(String[] args) {
        int[][] numeros = new int[10][10];

        for (int i = 0; i < numeros.length; i++) { //filas
            for (int j = 0; j < numeros[i].length; j++) { //columnas
                numeros[i][j] = (int) (Math.random()*(300-201)+201);
                if (i==j){
                    System.out.print(numeros[i][j]);
                } else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(numeros));
    }
}
