package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_4_extra {
    public static void main(String[] args) {
        String[][] tablero = new String[8][8];
        Character[] columnas = {'a','b','c','d','e','f','g','h'};
        Scanner sc = new Scanner(System.in);
        String posicion;
        int pieza;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]=" ";
            }
        }

        System.out.println("Introduzca la posición de la ficha");
        posicion = sc.nextLine();

        int col = obtenerColumna(posicion.charAt(0),columnas); // para sacar el primer elemento de lo que introduce el usuario y "traducirlo" a número
        int fila = 8 - Integer.parseInt(""+posicion.charAt(1)); // porque el tablero está al contrario que la forma del array

        tablero[fila][col] = "X"; // ubicación de la ficha

        System.out.println("Indique si está jugando con alfil (1), torre (2), dama (3), rey (4), caballo (5)");
        pieza = sc.nextInt();

        if(pieza==1){ // --------------------------------------------------ALFIL
            //Diagonal Superior Derecha
            int i = fila-1;
            int j = col+1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i--;
                j++;
            }
            //Diagonal Superior Izquierda
            i = fila-1;
            j = col-1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i--;
                j--;
            }
            //Diagonal Inferior Derecha
            i = fila+1;
            j = col+1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i++;
                j++;
            }
            //Diagonal Inferior Izquierda
            i = fila+1;
            j = col-1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i++;
                j--;
            }
            System.out.println();
        } else if (pieza==2){ // -----------------------------------------------TORRE
            /*//Superior
            int i = fila-1;
            int j = col;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i--;
            }
            System.out.println();
            //Inferior
            i = fila+1;
            j = col;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i++;
            }
            System.out.println();
            //Inferior
            i = fila+1;
            j = col;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i++;
            }
            System.out.println();
            //Lateral izquierdo
            i = fila;
            j = col-1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                j--;
            }
            System.out.println();
            //Lateral derecho
            i = fila;
            j = col+1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                j++;
            }
            System.out.println();
            */

            // ********* CON SOLO DOS PARTES **********

            //Superior e Inferior (cambia fila)
            for (int i = 0; i < tablero.length; i++) {
                if(i!=fila){
                    tablero[i][col] = "*";
                }
            }
            // Derecha e Izquierda (cambia columna)
            for (int j = 0; j < tablero[fila].length; j++) {
                if(j!=col){
                    tablero[fila][j] = "*";
                }
            }

        } else if (pieza==3){ // ------------------------------------- DAMA
            //Superior e Inferior (cambia fila)
            for (int i = 0; i < tablero.length; i++) {
                if(i!=fila){
                    tablero[i][col] = "*";
                }
            }
            // Derecha e Izquierda (cambia columna)
            for (int j = 0; j < tablero[fila].length; j++) {
                if(j!=col){
                    tablero[fila][j] = "*";
                }
            }
            //Diagonal Superior Derecha
            int i = fila-1;
            int j = col+1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i--;
                j++;
            }
            //Diagonal Superior Izquierda
            i = fila-1;
            j = col-1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i--;
                j--;
            }
            //Diagonal Inferior Derecha
            i = fila+1;
            j = col+1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i++;
                j++;
            }
            //Diagonal Inferior Izquierda
            i = fila+1;
            j = col-1;
            while (estaDentro(i,j)) {
                tablero[i][j] = "*";
                System.out.print(columnas[j]+""+(8-i)+" ");
                i++;
                j--;
            }
            System.out.println();
        } else if (pieza==4){ // ---------------------------------------------------REY
            //Superior
            int i = fila-1;
            int j = col;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            System.out.println();
            //Inferior
            i = fila+1;
            j = col;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            System.out.println();
            //Inferior
            i = fila+1;
            j = col;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            System.out.println();
            //Lateral izquierdo
            i = fila;
            j = col-1;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            System.out.println();
            //Lateral derecho
            i = fila;
            j = col+1;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            System.out.println();
            //Diagonal Superior Derecha
            i = fila-1;
            j = col+1;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            //Diagonal Superior Izquierda
            i = fila-1;
            j = col-1;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            //Diagonal Inferior Derecha
            i = fila+1;
            j = col+1;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            //Diagonal Inferior Izquierda
            i = fila+1;
            j = col-1;
            tablero[i][j] = "*";
            System.out.print(columnas[j]+""+(8-i)+" ");
            System.out.println();
        } else if (pieza==5){ // --------------------------------------------------- CABALLO
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if(((i==fila-2) && (j == col-1 || j==col+1)) ||
                            ((i==fila-1) && (j == col-2 || j==col+2))||
                            ((i==fila+1) && (j == col-2 || j==col+2))||
                            ((i==fila+2) && (j == col-1 || j==col+1))){
                        tablero[i][j] = "*";
                        System.out.print(columnas[j]+" "+(8-i)+" ");
                    }
                }
            }
            System.out.println();
        }

        for (String[] row: tablero) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int obtenerColumna(Character c,Character[] columnas) {
        for (int i = 0; i < columnas.length; i++) {
            if (columnas[i]==c) {
                return i;
            }
        }
        return 0;
    }

    public static boolean estaDentro(int i, int j) {
        return (i>=0 && i<=7 && j>=0 && j<=7);
    }
}
