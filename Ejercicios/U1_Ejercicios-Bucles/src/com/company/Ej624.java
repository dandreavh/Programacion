package com.company;

import java.util.Scanner;

public class Ej624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, suma;

        do{
            System.out.println("Escriba el primer número");
            n1 = sc.nextInt();
            System.out.println("Escriba el segundo número");
            n2 = sc.nextInt();
            suma = n1+n2;
            System.out.println("La suma de " + n1 + " + " + n2 + " es " + suma);
        } while (suma != 0 && (n1!=0 || n2!=0));
    }
}
