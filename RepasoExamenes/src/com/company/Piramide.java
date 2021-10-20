package com.company;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int cantEspacios = 0;
        int cantCaracter = 1;

        System.out.println("Escriba una altura");
        altura = sc.nextInt();
        cantEspacios = altura-1;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < cantEspacios; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < cantCaracter; k++) {
                System.out.print("*");
            }
            System.out.println("");
            cantEspacios--;
            cantCaracter+=2;
        }

    }
}
