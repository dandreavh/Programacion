package com.company;

import java.util.Scanner;

public class Ej541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduzca un número");
        num1 = sc.nextInt();

        System.out.println("Introduzca otro número");
        num2 = sc.nextInt();

        if((num1 >= 0) && (num2 >=0)){
            System.out.println("Se cumple");
        } else{
            System.out.println("NO se cumple");
        }
    }
}
