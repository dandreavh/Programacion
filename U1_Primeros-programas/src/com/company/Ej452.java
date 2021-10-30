package com.company;

import java.util.Scanner;

public class Ej452 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short aNacimiento, aActual;
        System.out.println("Año de nacimiento");
        aNacimiento = sc.nextShort();

        System.out.println("Año actual");
        aActual = sc.nextShort();

        System.out.println("Su edad es de " + (aActual-aNacimiento));

    }
}
