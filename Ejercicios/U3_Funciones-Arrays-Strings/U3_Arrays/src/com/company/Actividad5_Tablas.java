package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_Tablas {
    // Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
    // Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera,
    // de forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden correcto para que
    // los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] primera = new int [6];
        int [] segunda = new int [6];
        int [] fusion = new int [12];

        for (int i = 0; i < primera.length; i++) {
            primera[i] = sc.nextInt();
        }
        for (int i = 0; i < segunda.length; i++) {
            segunda[i] = sc.nextInt();
        }

        Arrays.sort(primera);
        Arrays.sort(segunda);

        fusion = (Arrays.copyOf(primera, primera.length));
      


        for (int i = 0; i < fusion.length; i++) {

        }
    }
}
