package com.company;

import java.util.Scanner;

public class Ej636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n1, n2;

        System.out.println("Escriba un número (alto)");
        n1 = sc.nextByte();
        System.out.println("Escriba otro número (ancho)");
        n2 = sc.nextByte();


        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
