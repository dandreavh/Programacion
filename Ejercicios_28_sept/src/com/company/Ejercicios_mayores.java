package com.company;

import java.util.Scanner;

public class Ejercicios_mayores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, mayor;

        System.out.println("Número 1");
        num1 = sc.nextInt();
        System.out.println("Número 2");
        num2 = sc.nextInt();
        System.out.println("Número 3");
        num3 = sc.nextInt();

        if ((num1 > num2 && num1 > num3) || (num1 == num2 && num2 == num3) || (num1 == num2 && num2 > num3)){
            mayor = num1;
        } else {
            if ((num2 > num3) || (num2 == num3 & num3 > num1)){
                mayor = num2;
            } else{
                mayor = num3;
            }
        }

        System.out.println("El mayor es " + mayor);
    }
}
