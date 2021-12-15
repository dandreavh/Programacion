package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    /*
     Escribe un programa que al usuario un número entero y rellene una matriz cuadrada de de esas dimensiones con valores
     entre 100 y 200.
     A continuación se pasará esa matriz a la función numPicos que nos devolvéra el número de celdas de la matriz bidimensional
      que son mayores o iguales que todos sus vecinos adyacentes.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
        int[][] matriz;
        int valor;

        System.out.println("Indique un tamaño para la matriz");
        tam = sc.nextInt();

        matriz = new int[tam][tam];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                valor = (int) (Math.random()*(201-100)+100);
                matriz[i][j] = valor;
            }
        }

        for (int[] row:matriz) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Hay " +numPicos(matriz)+ " picos");
    }
    public static int numPicos (int[][] matriz){
        int cantPicos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(esPico(matriz, matriz[i][j])){
                    cantPicos++;
                }
            }
        }
        return cantPicos;
    }
    public static boolean esPico (int[][] matriz, int num){
        int numPico = 0;
        int pos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                pos++;
                if(i==0 && j ==0){
                    numPico = matriz[i][j];
                } else{
                    if(matriz[i][j]>numPico){
                        numPico = matriz[i][j];
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
