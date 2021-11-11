package com.company;

import java.util.Scanner;

public class Ejercicio_2_4 {
    // Ejercicio2-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
    // y calcule su equivalencia en metros (1 milla = 1609 m)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas, metros = 1609;

        System.out.println("Introduzca una longitud en millas");
        millas = sc.nextInt();

        System.out.println(millas + " millas en metros = " + (millas*metros));
    }
}
