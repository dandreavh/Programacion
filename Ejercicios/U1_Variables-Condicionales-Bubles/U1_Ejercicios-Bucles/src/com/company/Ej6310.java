package com.company;

import java.util.Scanner;

public class Ej6310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, num, cont = 0;
        boolean primo = true;

        System.out.println("Escriba un entero");
        n1 = sc.nextInt();
        System.out.println("Escriba otro entero");
        n2 = sc.nextInt();

        for (int i=n1; i<n2; i++){
            num = i;
            for (int j=i; j<i; j++){
                if (i%j!=0){
                    cont++;
                }
            }
        }

        System.out.println("Hay " + cont + " primos");

//
//        if(primo){
//            System.out.println("Es primo");
//        } else{
//            System.out.println("No es primo");
//        }
    }
}
