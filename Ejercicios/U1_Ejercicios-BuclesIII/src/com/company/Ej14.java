package com.company;

import java.util.Scanner;

public class Ej14 {
    //Actividad8-14: Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado,
    // utilizando para ello asteriscos (*). Por ejemplo, para n=4:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Escriba una cantidad para el lado del triángulo");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
        }
    }
}
