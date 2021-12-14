package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_Azul {
    // Indicar la posición
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] tablero = new int[4][6];
        int pos;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = (int) (Math.random()*(100-10)+10);
            }
        }

        for (int[] row : tablero ) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Indique una posición del tablero");
        pos = sc.nextInt();

        System.out.println("En la posición " +pos+ " está el número " + nEnesimo(tablero,pos));

    }

    private static int nEnesimo(int[][] tablero, int pos) {
        int posActual = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
               if (posActual==pos){
                   return tablero[i][j];
               } else{
                   posActual++;
               }
            }
        }
        return -1;
    }
}
