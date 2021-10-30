package com.company;

import java.util.Scanner;

public class Ej_5_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, par;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        if (num%2 == 0){
            par = 1;
        } else{
            par = 0;
        }

        par = num%2 == 0 ? 1 : 0;

        System.out.println("Par 1 / Impar 0 --> " + par);
    }
}
