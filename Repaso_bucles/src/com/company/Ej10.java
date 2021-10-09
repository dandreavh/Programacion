package com.company;

import java.util.Scanner;

public class Ej10 {
    //Actividad8-10: Implementar una aplicación que pida un número al usuario entre el 1 y el 10,
    // calcule su tabla de multiplicar. El código debe asegurarse de que el número introducido está entre 1 y 10,
    // y si no es así, volver a pedirlo hasta que lo cumpla.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, multiplicacion;

        do {
            System.out.println("Introduzca un número entre el 1 y el 10");
            num = sc.nextInt();
        } while (num>10 || num<1);

        for (int i = 0; i < 11; i++) {
            multiplicacion = num*i;
            System.out.println(num + " x " + i + " = " + multiplicacion);
        }
    }
}
