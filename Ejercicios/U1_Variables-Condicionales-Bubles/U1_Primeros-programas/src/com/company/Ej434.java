package com.company;

import java.util.Scanner;

public class Ej434 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int longitud, metros;

        System.out.println("Introduzca una longitud en millas");
        longitud = sc.nextInt();
        metros = 1609;

        System.out.println("Su longitud en metros sería de " + (longitud*metros));
    }
}
