package com.company;

import java.util.Scanner;

public class Ejercicio2_ExamenRojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        int par = 0, impar = 0, sumaPares, sumaImpares, cifra;

        System.out.println("Escriba un número");
        num = sc.nextLong();

        while (num>0){
            cifra = (int) (num%10);
            if (cifra%2==0){
                par += cifra*10;
            } else{
                impar += cifra*10;
            }
            num/=10;
        }
        System.out.println(par);
        System.out.println(impar);
    }
}
