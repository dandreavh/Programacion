package com.company;

import java.util.Scanner;

public class Ejercicio_5_4 {
    //Ejercicio5-4: Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Escriba un número");
        num1 = sc.nextInt();
        System.out.println("Escriba otro número");
        num2 = sc.nextInt();

        if((num1%2==0) && (num2%2==0)){
            System.out.println("Los dos son pares");
        } else{
            if((num1%2==0) || (num2%2==0)){
                System.out.println("Uno de los dos es par");
            } else{
                System.out.println("Ninguno de los dos es par");
            }
        }

    }
}
