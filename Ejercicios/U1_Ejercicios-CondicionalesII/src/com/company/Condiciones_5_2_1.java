package com.company;

import java.util.Scanner;

public class Condiciones_5_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        if (num >= 0){
            System.out.println("Su número es positivo");
        } else{
            System.out.println("Su número es negativo");
        }
    }
}
