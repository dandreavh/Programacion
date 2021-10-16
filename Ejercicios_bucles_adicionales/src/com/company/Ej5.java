package com.company;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int anchura = altura+1;
        int cantCaracter = 0;
        int cantHuecos = altura-2;
        String caracter;

        System.out.println("Escriba una altura para la pirámide");
        altura = sc.nextInt();
        sc.nextLine();
        System.out.println("Indique qué caracter desea que se imprima");
        caracter = sc.nextLine();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.println();
                for (int k = 0; k < 5; k++) {
                    System.out.println(caracter);
                }
                cantHuecos--;
            }
        }
    }
}
