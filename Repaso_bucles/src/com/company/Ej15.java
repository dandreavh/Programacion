package com.company;

import java.util.Scanner;

public class Ej15 {
    // Actividad8-15: Realizar un programa que nos pida un número n,
    // y nos diga cuantos números hay entre 1 y n que sean primos.
    // Un número primo es aquel que sólo es divisible por 1 y por él mismo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cant_primos = 0;
        boolean primo = true;

        System.out.println("Introduzca un número");
        n = sc.nextInt();

        for (int i = 1; i < n ; i++) {
            for (int j = 2; j < n-1; j++) {
                if(i%j==0){
                    primo = false;
                } else{
                    primo = true;
                }
            }
            if (primo){
                cant_primos++;
            }
            System.out.println(i + " ¿es primo? " + primo);
        }

        System.out.println("Entre 1 y " + n + " hay " + cant_primos + " primos");
    }
}
