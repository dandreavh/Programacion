package com.company;

import java.util.Scanner;

public class Ej4 {
    //Actividad8-4: Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Escriba un número");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}
