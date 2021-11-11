package com.company;

import java.util.Scanner;

public class Ej4 {
    // Realiza un programa que solicite al usuario un número entero positivo con una cantidad de 6 cifras exactamente.
    // Si el número no tiene esa cantidad de cifras, se vuelve a pedir el número hasta que sea de 6 cifras.
    // Una vez tengamos el número se deberá comprobar si el número compuesto por las tres primeras cifras es primo.
    // Lo mismo para el número compuesto por las tres últimas cifras.
    // Se deberá mostrar un mensaje por pantalla tanto si es primo como si no lo es.
    // Si al partir el número, se comienza en 0, se considera que el número es el entero que se obtendría.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, primeros, ultimos;
        boolean esPrimo = true;

        do {
            System.out.println("Escriba un número de 6 cifras");
            num = sc.nextInt();
        } while(num<100000 || num>999999);

        primeros=num/1000;
        ultimos=num%1000;

        for (int i = 2; i < primeros; i++) {
            if(primeros%i==0){
                esPrimo=false;
                break;
            }
        }
        System.out.println("Primeros: " +primeros+ " es un número primo: " +esPrimo);

        esPrimo=true;
        for (int i = 2; i < ultimos; i++) {
            if(ultimos%i==0){
                esPrimo=false;
                break;
            }
        }
        System.out.println("Últimos: " +ultimos+ " es un número primo: " +esPrimo);

    }
}
