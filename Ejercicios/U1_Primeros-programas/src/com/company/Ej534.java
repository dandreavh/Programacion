package com.company;

import java.util.Scanner;

public class Ej534 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escriba un num");
        num = sc.nextInt();

        if ((num%3) == 0){
            System.out.println("Es múltiplo");
        } else{
            System.out.println("No es múltiplo");
        }
    }
}
