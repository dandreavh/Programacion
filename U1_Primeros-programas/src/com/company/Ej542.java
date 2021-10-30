package com.company;

import java.util.Scanner;

public class Ej542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Escriba un número");
        num1 = sc.nextInt();
        System.out.println("Escriba otro número");
        num2 = sc.nextInt();

        if((num1 >= 0) || (num2 >= 0)){
            System.out.println("se cumple");
        } else{
            System.out.println("no se cumple");
        }
    }
}
