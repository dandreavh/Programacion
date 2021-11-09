package com.company;

import java.util.Scanner;

public class Ej612 {
    public static void main(String[] args) {
        //Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "while"
        Scanner sc = new Scanner(System.in);
        int num = 20;

        while (num>=2){
            if (num%2==0){
                System.out.println(num);
            }
            num--;
        }
    }
}
