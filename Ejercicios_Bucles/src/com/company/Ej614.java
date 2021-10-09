package com.company;

import java.util.Scanner;

public class Ej614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        while(num !=0){
            System.out.println("El cuadrado de su número es " + (num*num));
            System.out.println("Introduzca otro número");
            num = sc.nextInt();
        }
    }
}
