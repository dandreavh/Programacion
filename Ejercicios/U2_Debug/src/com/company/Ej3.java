package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número");
        num = sc.nextInt();

        if (esPrimo(num)){
            System.out.println("El número " + num + " es primo");
        } else{
            System.out.println("El número " + num + " no es primo");
        }
    }

    private static boolean esPrimo(int num) {
        boolean esPrimo=true;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                esPrimo = false;
                break;
            } else{
                esPrimo = true;
            }
        }
        return esPrimo;
    }
}
