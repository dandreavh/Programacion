package com.company;

import java.util.Scanner;

public class Ej1 {
    // Act1: Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo,
    // y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cuadrado = 0;
        boolean par = true;
        boolean positivo = true;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        while (num!=0) {
            if (num%2==0){
                par = true;
            } else{
                par = false;
            }

            if (num<0){
                positivo = false;
            } else{
                positivo = true;
            }

            cuadrado = num*num;

            System.out.println("Su número " + num + " ¿es par? " + par + " ¿es positivo? " + positivo + " y su cuadrado es " + cuadrado);

            System.out.println("Introduzca otro número");
            num = sc.nextInt();
        }

    }
}
