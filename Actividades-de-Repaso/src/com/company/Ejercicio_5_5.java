package com.company;

import java.util.Scanner;

public class Ejercicio_5_5 {
    //Ejercicio5-5: Crea un programa que pida tres números enteros largos al usuario
    // y diga cuál es el mayor de los tres.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, mayor;

        System.out.println("Introduzca un número");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número");
        num2 = sc.nextInt();
        System.out.println("Introduzca un tercer número");
        num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            mayor = num1;
        }else{
            if(num2>num3){
                mayor = num2;
            } else{
                mayor = num3;
            }
        }

        System.out.println("El mayor es " + mayor);
    }
}
