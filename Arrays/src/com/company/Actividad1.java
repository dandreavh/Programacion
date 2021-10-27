package com.company;

import java.util.Scanner;

public class Actividad1 {
    //Actividad 1: Diseñar una función eco() a la que se le pasa como parámetro un número n,
    // y muestra por pantalla n veces el mensaje "Eco..."
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número para hacer eco");
        num = sc.nextInt();

        eco(num);
    }

    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }
    }
}
