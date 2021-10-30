package com.company;

import java.util.Scanner;

public class Ejercicio_3_4 {
    //Ejercicio3-4: Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule
    // su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float millas, km = (float) 1.609;

        System.out.println("Introduzca su longitud en millas");
        millas = sc.nextFloat();

        System.out.println(millas + " millas en km es = " + (millas*km));

    }
}
