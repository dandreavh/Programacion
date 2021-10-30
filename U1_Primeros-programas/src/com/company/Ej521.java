package com.company;

import java.util.Scanner;

public class Ej521 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escriba un número");
        num = sc.nextInt();

        if (num >= 0){
            System.out.println("Es positivo");
        }else{
            System.out.println("No es positivo");
        }
    }
}
