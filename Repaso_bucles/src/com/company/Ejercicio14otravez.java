package com.company;

import java.util.Scanner;

public class Ejercicio14otravez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant;

        System.out.println("Escriba una cantidad para el tamaño");
        cant = sc.nextInt();

        for (int i = 0; i < cant; i++) {
            System.out.print("* ");

        }

    }
}
