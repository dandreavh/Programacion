package com.company;

import java.util.Scanner;

public class Ej533 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("Escriba un número real");
        num1 = sc.nextDouble();
        System.out.println("Escriba otro número real");
        num2 = sc.nextDouble();

        if (num1 == num2){
            System.out.println("son iguales");
        } else{
            if (num1>num2){
                System.out.println(" El primero es mayor");
            } else{
                System.out.println(" El segundo es mayor");
            }
        }
    }
}
