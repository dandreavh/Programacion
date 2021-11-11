package com.company;

import java.util.Scanner;

public class Ejercicio15otravez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cant_primos = 0;
        boolean primo = true;


        System.out.println("Escriba un número");
        n = sc.nextInt();

        for (int i = 1; i < n ; i++) {
           primo  = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.println(i + " es primo");
                cant_primos++;
            } else{
                System.out.println( i +" no es primo");
            }
        }


        System.out.println("Hay " + cant_primos + " números primos entre " + " 1 y " + n);
    }
}
