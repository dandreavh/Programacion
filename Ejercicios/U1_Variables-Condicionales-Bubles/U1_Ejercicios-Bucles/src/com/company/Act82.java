package com.company;

import java.util.Scanner;

public class Act82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, media = 0, suma = 0, mayores = 0, contador = 0;

        System.out.println("Introduzca una edad");
        edad = sc.nextInt();

        while (edad>0){
            suma = edad + suma;
            contador++;

            if (edad>=18){
                mayores++;
            }

            System.out.println("Introduzca una edad");
            edad = sc.nextInt();
        }

        media = suma/contador;

        System.out.println("La suma de las edades es " + suma);
        System.out.println("La cantidad de mayores es " + mayores);
        System.out.printf("La media es " + media);

    }
}
