package com.company;

import java.util.Scanner;

public class Ej5 {
    //Actividad8-5: Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
    // A continuación, solicitará por teclado un valor que debe estar dentro del rango.
    // Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min;
        int max;
        int num;
        int aux;

        System.out.println("Introduzca un mínimo");
        min = sc.nextInt();
        System.out.println("Introduzca un máximo");
        max = sc.nextInt();
        System.out.println("Introduzca un número que esté dentro del rango señalado");
        num = sc.nextInt();

        if (min>max){
            aux = max;
            max = min;
            min = aux;
            System.out.println("Ha introducido los datos de alterados, pero lo he ordenado");
        }

        while (num<min || num>max){
            System.out.println("En número está fuera de rango, introduzca otro");
            num = sc.nextInt();
        }

        System.out.println("Su número está dentro del rango. Adiós");
    }
}
