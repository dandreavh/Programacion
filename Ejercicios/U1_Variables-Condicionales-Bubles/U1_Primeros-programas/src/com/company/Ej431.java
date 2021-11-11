package com.company;

import java.util.Scanner;

public class Ej431 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int primerNumero = sc.nextInt();
        System.out.println("Introduzca otro número");
        int segundoNumero = sc.nextInt();

        System.out.println("La suma de sus números es " + (primerNumero+segundoNumero));
    }
}
