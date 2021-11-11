package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2_Tablas {
    // Escribir una aplicación que solicite al usuario cuántos números desea introducir.
    // A continuación, se introducirá por teclado esa cantidad de números enteros, y por último,
    // los mostrará en el orden inverso al introducido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantNum;

        System.out.println("Indique cuántos números desea introducir");
        cantNum = sc.nextInt();
        int [] cadena = new int [cantNum];

        for (int i = cadena.length-1; i >= 0; i--) {
            System.out.println("Escriba un número");
            cadena[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(cadena));

    }
}
