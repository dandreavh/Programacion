package com.company;

import java.util.Scanner;

public class Ej2 {
    //Actividad8-2: Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos
    // de los alumnos. Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
    // La aplicación mostrará la suma de las edades,
    // la media, de cuántos alumnos hemos introducido su edad,
    // y cuántos alumnos son mayores de edad.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int suma = 0;
        int mayoresEdad = 0;
        int totalEdades = 0;
        float media;

        System.out.println("Introduzca una edad");
        edad = sc.nextInt();

        while (edad>=0) {
            suma = edad + suma;

            if (edad>=18){
                mayoresEdad++;
            }
            totalEdades++;

            System.out.println("Introduzca otra edad");
            edad = sc.nextInt();
        }

        media = suma/totalEdades;

        System.out.println("Suma de edades: " + suma);
        System.out.println("Media de edades: " + media);
        System.out.println("Cantidad de mayores de edad: " + mayoresEdad);

    }
}
