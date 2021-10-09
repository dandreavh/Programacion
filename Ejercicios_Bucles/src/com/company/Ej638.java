package com.company;

import java.util.Scanner;

public class Ej638 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;
        boolean primo = true;

        System.out.println("Escriba un entero largo");
        num = sc.nextInt();

        for (int i=2; i<num; i++){
            if (num%i==0){
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.println("Es primo");
        } else{
            System.out.println("No es primo");
        }
    }
}
