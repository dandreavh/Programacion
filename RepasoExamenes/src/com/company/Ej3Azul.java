package com.company;

import java.util.Scanner;

public class Ej3Azul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int cantBlancos = (altura-1)/2;

        do{
            System.out.println("Introduzca la altura de la flecha");
            altura = sc.nextInt();

        } while (altura<3 || altura%2==0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {

                for (int k = 0; k < cantBlancos; k++) {
                    System.out.print("-");
                    cantBlancos--;
                }

                System.out.print("*");
            }
            if(i==(altura-1)/2){
                System.out.print("*****");
            }
            System.out.println();
        }


    }
}
