package com.company;

import java.util.Scanner;

public class Ej451 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte a, b;
        System.out.println("Primer número entero pequeño");
        a = sc.nextByte();
        System.out.println("Segundo número");
        b = sc.nextByte();

        System.out.println("La suma de sus números da " + (a+b));
    }
}
