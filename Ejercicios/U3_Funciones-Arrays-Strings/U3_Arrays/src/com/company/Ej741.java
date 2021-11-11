package com.company;

import java.util.Scanner;

public class Ej741 {
    // Crea un programa que pida al usuario 5 números reales, que guardará en un array.
    // Luego calculará y mostrará su media (la suma de todos los datos,
    // dividida entre la cantidad de datos) y los valores que están por encima de la media.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        double media, suma = 0;
        String mayores = "";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un número");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        media = suma/numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>media){
                mayores += " "+numeros[i];
            }
        }

        System.out.println("Media: " +media+ " y los números mayores de la media: " +mayores);

    }
}
