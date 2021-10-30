package com.company;

import java.util.Scanner;

public class Ejercicio_2_3 {
    // Ejercicio2-3: un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Introduzca un número");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        num2 = sc.nextInt();

        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
}
