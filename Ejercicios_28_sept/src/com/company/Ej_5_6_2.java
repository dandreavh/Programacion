package com.company;

import java.util.Scanner;

public class Ej_5_6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2, menor;

        System.out.println("Escriba un número");
        num1 = sc.nextByte();
        System.out.println("Escriba otro número");
        num2 = sc.nextByte();

        if (num1<num2){
            menor = num1;
        } else{
            menor = num2;
        }

        menor = num1<=num2 ? num1 : num2;

        System.out.println("El menor es " + menor);
    }
}
