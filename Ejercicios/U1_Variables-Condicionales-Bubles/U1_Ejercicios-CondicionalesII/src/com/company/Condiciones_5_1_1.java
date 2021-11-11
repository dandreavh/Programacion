package com.company;

import java.util.Scanner;

public class Condiciones_5_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        if (num >= 0){
            System.out.println("Su número es positivo");
        }
        if (num < 0){
            System.out.println("Su número es negativo");
        }
    }
}
