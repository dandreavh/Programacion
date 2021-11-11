package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int primerAnterior = 1;
        int segundoAnterior = 0;
        int suma;

        System.out.println("Introduzca la cantidad de términos que desea sacar de la serie Fibonacci");
        n = sc.nextInt();

        System.out.print(segundoAnterior + " - " + primerAnterior);

        for (int i = 1; i < n-1; i++) {
            suma = segundoAnterior + primerAnterior;

            segundoAnterior = primerAnterior;
            primerAnterior = suma;

            System.out.print(" - " + suma);
        }

    }
}
