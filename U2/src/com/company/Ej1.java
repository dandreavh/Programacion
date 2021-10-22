package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anchura;

        do{
            System.out.println("Indique una anchura");
            anchura = sc.nextInt();
        } while (anchura<3 || anchura%2==0);

        for (int i = 0; i < anchura; i++) {
            for (int j = 0; j < anchura; j++) {
                if(i==0 || i==anchura-1){
                    System.out.print("*");
                } else if (i+j==anchura-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }

            }
            for (int j = 0; j < anchura; j++) {
                if(i==0 || i==anchura-1){
                    System.out.print("*");
                } else if (i+j==anchura-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
