package com.company;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int anchura;

        System.out.println("Escriba una altura");
        altura = sc.nextInt();
        System.out.println("Escriba una anchura");
        anchura = sc.nextInt();
        //SI NO ME PIDEN ANCHURA
//        for (int i = 0; i < altura; i++) {
//            if (i==altura-1){
//                System.out.print(espacioBlanco + "***" + espacioBlanco);
//            } else{
//                System.out.println("*   *");
//            }
//
//        }

        //DETERMINANDO LA ANCHURA
        for (int i = 0; i < altura; i++) {
            if (i==altura-1){
                System.out.print(" ");
                for (int j = 0; j < anchura-2; j++) {
                        System.out.print("*");
                }
                System.out.print(" ");

            } else{
                System.out.print("*");
                for (int j = 0; j < anchura-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
