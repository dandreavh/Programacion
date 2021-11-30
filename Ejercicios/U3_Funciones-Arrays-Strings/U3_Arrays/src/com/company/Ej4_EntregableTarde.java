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
        int n;
        char[][] tablero;
        String posicion;
        char fila;
        char columna;

        System.out.println("Introduzca el tamaño del tablero");
        n = sc.nextInt();
        sc.nextLine();
        tablero = new char[n][n];

        System.out.println("Indique una posición. Ejemplo: 1,0");
        posicion = sc.nextLine();
        fila = (posicion.charAt(0));
        columna = posicion.charAt(2);

        for (int i=0;i<tablero.length;i++) {
            for (int j=0;j<tablero[i].length;j++) {
                int numero = (int) (Math.random()*100+1);

                if (numero>=50) {
                    tablero[i][j] = 'X';
                } else {
                    tablero[i][j] = ' ';
                }
            }
        }

        for (int i=0;i<tablero.length;i++) {
            for (int j=0;j<tablero[i].length;j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        System.out.println("La posición "+(posicion)+" tiene " +buscaminas(fila,columna,tablero)+ " bombas, pruebe otra posición");
    }

    public static int buscaminas (int fila, int col, char[][] tablero)  {
        int minas = 0;

        if (tablero[fila][col] =='X') {
            return -1;
        } else {
            for (int i = fila-1 ; i<=fila+1 ;i++) {
                for (int j = col-1; j <=col+1 ; j++) {
                    if (i>=0 && j>=0 && i<tablero.length && j<tablero[i].length) {
                        if (tablero[i][j] == 'X') {
                            minas++;
                        }
                    }

                }
            }
        }

        return minas;
    }
}
