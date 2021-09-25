package com.company;

import java.util.Scanner;

public class Ejercicio_4_2 {
    //Actividad 4.2 - Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
    //Hay que tener en cuenta que la media puede contener decimales
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        double media;

        System.out.println("Nota 1");
        nota1 = sc.nextInt();
        System.out.println("Nota 2");
        nota2 = sc.nextInt();

        media = (nota1+nota2)/2;

        System.out.println("Su nota media es de " + media);

    }
}
