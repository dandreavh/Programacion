package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_ExamenMananaAzul {
    // Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional
    // en la posición n-ésima contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo.
    // El primer elemento es el 0.
    // Si la posición donde se busca no existe en el array, la función debe devolver -1.
    // Se debe entregar tanto el código de la función como el código de prueba que la usa.
    // Rellenaremos los arrays de manera aleatorio con números entre 10 y 100 (ambos incluidos).
    // La cabecera de la función es la siguiente: public static int nEsimo(int[][] n, int posicion)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[4][6];
        int posicion;
        int valor;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                valor = (int) (Math.random()*(101-10)+10);
                tablero[i][j] = valor;
            }
        }

        for (int[] row:tablero) {
            System.out.println(Arrays.toString(row));
        }

        do{
            System.out.println("Indique una posición");
            posicion = sc.nextInt();
            System.out.println(nEsimo(tablero, posicion));
        } while (nEsimo(tablero, posicion)!=-1);

    }
    public static int nEsimo(int[][] n, int posicion){
        int resultado = 0;
        int posTablero = -1;
        int num;
        int i = 4, j = 6;

        if (posicion>-1 && posicion<(i*j)){
            for (i = 0; i < n.length; i++) {
                for (j = 0; j < n[i].length; j++) {
                    posTablero++;
                    num = n[i][j];
                    if(posicion == posTablero){
                        resultado = num;
                        break;
                    }
                }
            }
        }else{
            resultado = -1;
        }
        return resultado;
    }
}
