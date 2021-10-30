package com.company;

import java.util.Scanner;

public class Condiciones_5_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        if (num == 0){
            System.out.println("Su número es 0");
        } else{
            if (num < 0){
                System.out.println("Su número es negativo");
            } else {
                System.out.println("Su número es positivo");
            }
        }
    }
}
