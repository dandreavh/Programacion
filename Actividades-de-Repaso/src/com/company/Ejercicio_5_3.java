package com.company;

import java.util.Scanner;

public class Ejercicio_5_3 {
    //Ejercicio5-3: Crea un programa que diga si el número introducido por el usuario es impar o no lo es
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        if (num%2==0){
            System.out.println("PAR");
        } else{
            System.out.println("IMPAR");
        }
    }
}
