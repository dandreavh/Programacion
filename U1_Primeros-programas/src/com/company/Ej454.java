package com.company;

import java.util.Scanner;

public class Ej454 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float millas, km;
        System.out.println("Escriba sus millas");
        millas = sc.nextFloat();
        km = 609 ;

        System.out.println("Sus millas en km: " + millas*km);

    }
}
