package com.company;

import java.util.Scanner;

public class Actividad3_Tablas {
    // Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
    // Realizar la media de los números positivos, la media de los negativos,
    // y contar el número de ceros introducidos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int [] numeros;
        double sumaPositivos = 0, sumaNegativos = 0, mediaPositivos, mediaNegativos;
        int cantCeros = 0, cantPositivos = 0, cantNegativos = 0;

        System.out.println("Introduzca un número");
        n = sc.nextInt();
        numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un número para rellenar la cadena");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>0){
                sumaPositivos += numeros[i];
                cantPositivos++;
            } else if (numeros[i]<0) {
                sumaNegativos += numeros[i];
                cantNegativos++;
            } else if (numeros[i]==0){
                cantCeros++;
            }
        }

        mediaPositivos = sumaPositivos / cantPositivos;
        mediaNegativos = sumaNegativos / cantNegativos;

        System.out.println("La media de positivos: " +mediaPositivos);
        System.out.println("La media de negativos: " +mediaNegativos);
        System.out.println("Cantidad de ceros: " +cantCeros);
    }
}
