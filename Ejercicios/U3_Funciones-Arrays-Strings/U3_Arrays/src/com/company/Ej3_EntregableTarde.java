package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3_EntregableTarde {
    // Hacer un algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N filas
    // y N columnas con número aleatorios entre 100 y 200.
    // Mostrar dicho array y a continuación rotarlo 90 grados:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[][] caja;

        System.out.println("Indique un tamaño");
        n = sc.nextInt();
        caja = new int[n][n];

        int i;
        int j;

        for (i = 0; i < caja.length; i++) {
            for (j = 0; j < caja[i].length; j++) {
                caja[i][j] = (int) (Math.random()*(201-100)+100);
                System.out.print("[ "+caja[i][j]+" ]");
            }
            System.out.println();
        }

        System.out.println("Giro de 90ª");

        for (i = 0; i < caja.length; i++) {
            for (j = 0; j < caja[i].length; j++) {

                System.out.print("[ "+caja[i][j]+" ]");
            }
            System.out.println();
        }

    }
}
