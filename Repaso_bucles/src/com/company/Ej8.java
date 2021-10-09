package com.company;

import java.util.Scanner;

public class Ej8 {
    //Actividad8-8: Pedir un número y calcular su factorial.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, factorial = 1;

        System.out.println("Introduzca un número para calcular su factorial");
        num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            System.out.println(i);
            factorial = i*factorial;
        }
        System.out.println("El factorial de " + num + "! es " + factorial);
    }
}
