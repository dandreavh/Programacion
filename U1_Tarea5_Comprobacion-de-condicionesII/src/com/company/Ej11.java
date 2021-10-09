package com.company;

import java.util.Scanner;
//Realmente es el ejercicio 12

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, mayor, mediano, menor;

        System.out.println("Introduzca un número");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        num2 = sc.nextInt();
        System.out.println("Introduzca un tercer número");
        num3 = sc.nextInt();

        if (num1<num2 && num2>num3){
            System.out.println("Orden: " + num1 + ", " + num2 + ", " + num3);
        } else if (num3>num2 && num2>num1){
            System.out.println("Orden: " + num3 + ", " + num2 + ", " + num1);
        } else if (num1<num3 && num3>num2){
            System.out.println("Orden: " + num1 + ", " + num3 + ", " + num2);
        } else if (num2<num3 && num3>num1){
            System.out.println("Orden: " + num2 + ", " + num3 + ", " + num1);
        } else if (num3>num1 && num1<num2){
            System.out.println("Orden: " + num3 + ", " + num1 + ", " + num2);
        } else if (num2>num1 && num1<num3){
            System.out.println("Orden: " + num2 + ", " + num1 + ", " + num3);
        }

    }
}
