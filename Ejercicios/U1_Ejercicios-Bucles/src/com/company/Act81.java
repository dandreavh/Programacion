package com.company;

import java.util.Scanner;

public class Act81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cuadrado;
        boolean par = true;
        boolean positivo = true;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        while (num!=0){
            if (num%2==0){
                par = true;
            } else{
                par = false;
            }

            if (num<0){
                positivo = false;
            }
            cuadrado = num*num;

            System.out.println("El número " + num + " ¿es par? " + par +
                    " ¿es positivo? " + positivo + " y su cuadrado es " + cuadrado);

            System.out.println("Introduzca otro número");
            num = sc.nextInt();
        }

        System.out.println("Adiós");

    }
}
