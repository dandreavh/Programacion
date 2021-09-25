package com.company;

import java.util.Scanner;

public class Ejercicio_4_4 {
    //Actividad 4.4 - Sería interesante disponer de un programa que pida como entrada un número decimal y
    // lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.println("Introduzca un número decimal");
        num = sc.nextDouble();

        System.out.println("Su número redondeado sería " + Math.round(num));
    }
}
