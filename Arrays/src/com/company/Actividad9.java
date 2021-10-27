package com.company;

import java.util.Scanner;

import static com.company.Actividad7.esPrimo;

public class Actividad9 {
    //Actividad 9: Implementar la función divisoresPrimos() que muestra, por consola,
    // todos los divisores primos del número que se le pasa como parámetro
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        divisoresPrimos(num);
    }

    private static void divisoresPrimos(int num) {
        for (int i = 1; i <= num; i++) {
            if(num%i==0 && esPrimo(i)){
                System.out.println("Divisor primo: " +i+ " de " +num);
            }
        }
    }
}
