package com.company;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        char primero;

        System.out.println("Escriba un numero");
        num = sc.nextLine();
        primero = num.charAt(0);

        System.out.println("La primera cifra es " + primero);


    }
}
