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
        int[][] cajaGirada;


        System.out.println("Indique un tamaño");
        n = sc.nextInt();
        caja = new int[n][n];
        cajaGirada = new int[n][n];

        for (int i = 0; i < caja.length; i++) {
            for (int j = 0; j < caja[i].length; j++) {
                int valor = (int) (Math.random()*(201-100)+100);
                caja[i][j] = valor;
                cajaGirada[j][caja.length-1-i] = valor;
               // System.out.print("[ "+caja[i][j]+" ]");
               // System.out.print("[ "+cajaGirada[j][caja.length-1-i]+" ]");
            }
            // System.out.println();
        }

        for (int[] row:caja) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("****** Girado *******");
        for (int[] row:cajaGirada) {
            System.out.println(Arrays.toString(row));
        }
    }
}
