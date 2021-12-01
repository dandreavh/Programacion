package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    // Desarrollar una función que se denomine desplazarMatriz. Dicha función:
    //
    //    Recibirá como parámetro un vector bidimensional de enteros y el número de columnas
    //    que hay que desplazar la matriz.
    //    Devolverá como resultado un vector bidimensional que moverá las columnas de la matriz
    //    de entrada hacia la derecha tantas posiciones como se especifique en el segundo parámetro.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tabla = new int[3][4];
        int movimientos;

        System.out.println("Indique la cantidad de movimientos que desea realizar");
        movimientos = sc.nextInt();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (j==0){
                    tabla[i][j] = i+1;
                }
            }
        }

        System.out.println("Matriz original");
        for (int[] row:tabla) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Matriz desplazada");
        System.out.println(desplazarMatriz(tabla, movimientos));

    }
    public static int[][] desplazarMatriz(int[][]v, int cantMov){
        int[][] resultado = new int[3][4];
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                resultado[i][j+cantMov%v.length] = i+1;
            }
        }
        for (int[] row:resultado) {
            System.out.println(Arrays.toString(row));
        }
        return resultado;
    }
}
