package com.company;

import java.util.Scanner;

public class Ejercicio_3_3 {
    //Ejercicio3-3: Crea un programa que calcule y
    // muestre la división de dos números reales de doble precisión introducidos por el usuario

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Introduzca un número real doble");
        num1 = sc.nextDouble();
        System.out.println("Introduzca otro");
        num2 = sc.nextDouble();

        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
}
