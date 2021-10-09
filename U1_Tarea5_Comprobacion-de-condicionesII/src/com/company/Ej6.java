package com.company;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.println("Introduzca la primera nota");
        nota1 = sc.nextFloat();
        System.out.println("Introduzca la segunda nota");
        nota2 = sc.nextFloat();
        System.out.println("Introduzca la tercera nota");
        nota3 = sc.nextFloat();

        media = (nota1+nota2+nota3)/3;

        System.out.println("Su nota media es de " + media);
    }
}
