package com.company;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Escriba una altura para el palo vertical");
        altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            if (i==altura-1) {
                for (int j = 0; j < altura/2+1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.println("*");
            }
        }
    }
}
