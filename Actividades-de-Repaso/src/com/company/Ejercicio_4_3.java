package com.company;

import java.util.Scanner;

public class Ejercicio_4_3 {
    //Actividad 4.3 - Modificar el ejercicio anterior para que
    // muestre la parte entera de la media de tres notas decimales

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Nota 1");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2");
        nota2 = sc.nextDouble();
        System.out.println("Nota 3");
        nota3 = sc.nextDouble();

        media = ((nota1+nota2+nota3)/3);
        media = (int) media;

        System.out.println("Su nota media es de " + media);

    }
}
