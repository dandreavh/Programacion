package com.company;

public class Actividad8 {
    // Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma:
    // la posición [n,m] debe contener n+m. Después, se debe mostrar su contenido.
    public static void main(String[] args) {
        int[][] tablita = new int[5][5];

        for (int i = 0; i < tablita.length; i++) {
            for (int j = 0; j < tablita[i].length; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
