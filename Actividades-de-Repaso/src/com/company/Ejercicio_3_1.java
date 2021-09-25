package com.company;

import java.util.Scanner;

public class Ejercicio_3_1 {
    //Ejercicio3-1: Crea un programa que calcule y
    // muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2;

        System.out.println("Introduzca un número entero pequeño");
        num1 = sc.nextByte();
        System.out.println("Introoduzca otro número entero pequeño");
        num2 = sc.nextByte();

        System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1+num2));
    }
}
