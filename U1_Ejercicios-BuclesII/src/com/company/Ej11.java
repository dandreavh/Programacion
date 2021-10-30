package com.company;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Introduzca una altura");
        altura = sc.nextInt();

        if (altura>=3 && (altura%2!=0)){
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < altura; j++) {
                    if (i==j || (i+j)==altura-1){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        } else{
            System.out.println("Altura errónea");
        }
    }
}
