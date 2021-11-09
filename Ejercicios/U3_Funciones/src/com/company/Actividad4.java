package com.company;

import java.util.Scanner;

public class Actividad4 {
    // Actividad 4: Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Escriba el primer número");
        num1 = sc.nextInt();
        System.out.println("Escriba el segundo número");
        num2 = sc.nextInt();

        System.out.println("El mayor es " + mayor(num1, num2));

    }

    public static int mayor(int num1, int num2) {
        int mayor;
        if (num1>num2){
            mayor = num1;
        } else{
            mayor = num2;
        }
        return mayor;
    }
}
