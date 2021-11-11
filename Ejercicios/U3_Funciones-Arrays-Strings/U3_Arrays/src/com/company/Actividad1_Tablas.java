package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad1_Tablas {
    // Diseñar un programa que solicite al usuario 5 números decimales.
    // A continuación, debe mostrar los números en el mismo orden en que se han introducido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un número");
            numeros[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(numeros));
    }
}
