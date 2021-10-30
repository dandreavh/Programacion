package com.company;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if(i%2==0){
                System.out.println("Soy " + i + " y soy un número par");
            }
        }
    }
}
