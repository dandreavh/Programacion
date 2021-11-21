package com.company;

import java.util.Scanner;

public class Ej4_EntregableTarde {
    // Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N columnas.
    // A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
    //    O bien un carácter X que significa que hay una bomba.
    //    O bien un carácter - que significa que esa casilla no nada.
    //A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
    //En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar por pantalla la cantidad de bombas que hay en las casillas de alrededor.
    //Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que el usuario encuentre una bomba).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tablero;
        int n;
        int tipo;
        String posicion;
        char fila;
        char columna;

        System.out.println("Introduzca el tamaño del tablero");
        n = sc.nextInt();

        tablero = new String[n][n];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tipo = (int) (Math.random()*(2-0)+0);
                if(tipo==0){
                    System.out.print(" - ");
                } else{
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }

        boolean bomba = false;
        do{
            System.out.println("Indique una posición. Ejemplo: 1,0");
            posicion = sc.nextLine();
            fila = posicion.charAt(0);
            columna = posicion.charAt(2);

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if((i==fila && j==columna) && tablero[i][j].equals(" X ")){
                        System.out.println("La posición "+(posicion)+" tiene una bomba, está muerto");
                        bomba = true;
                        break;
                    } else{
                        System.out.println("La posición "+(posicion)+" tiene xxx bombas alrededor");
                    }
                }
            }

        } while (bomba = false);

    }
}
