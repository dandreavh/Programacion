package com.company;

import java.util.Scanner;

public class Ej2 {
    // Realizar un conversor del sistema decimal al sistema de asteriscos
    // que sustituye cada cifra por un número correspondiente de asteriscos (*) y separa las cifras con un guión.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, aux = 0, cifra;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        while(num>0){
            cifra = num%10;
            aux = cifra+aux*10;
            num/=10;
        }
        num = aux;
        aux =0;
        while(num>0){
            cifra = num%10;
            for (int i = 0; i < cifra; i++) {
                System.out.print("*");
            }
            System.out.print("-");
            aux = cifra+aux*10;
            num/=10;
        }

    }
}
