package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    // Realiza un programa que muestre por pantalla un array bidimensional cuadrado cuyo tamaño s
    // erá solicitado al usuario y que deberá rellenarse con números entre 18 y 65.
    //
    //A continuación, el programa debe mostrar los números de la diagonal que van desde la esquina
    //superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo y la media de
    // los números que hay en esa diagonal.
    //
    //Se valorará que la solución requiera el mínimo número de recorridos posibles del array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros;
        int[] diagonal = new int[0];
        int max = 0,min = 0,suma = 0;
        int tam, valor;

        System.out.println("Indique un tamaño");
        tam = sc.nextInt();

        numeros = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                valor = (int) (Math.random()*(66-18)+18);
                numeros[i][j] = valor;
                if(i==j){
                    System.out.print(valor);
                    if (j==0) {
                        max = valor;
                        min = valor;
                        suma = valor;
                    } else {
                        if (valor>max) {
                            max = valor;
                        }
                        if (valor<min) {
                            min = valor;
                        }
                        suma+=valor;
                    }
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("El máximo es " +max);
        System.out.println("El mínimo es " +min);
        System.out.println("La media es " +suma/tam);
    }
}
