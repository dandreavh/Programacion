package com.company;

public class Ej11 {
    //Actividad8-11: Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

    public static void main(String[] args) {
        int multiplicacion;
        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                multiplicacion = i*j;
                System.out.println(i + " x " + j + " = " + multiplicacion);
            }
            System.out.println();
        }
    }
}
