package com.company;

import java.util.Scanner;

public class Entregable4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int cantEspacios;
        int cantCaracter = 0;
        System.out.println("Escriba una altura para la flecha");
        altura = sc.nextInt();
        cantEspacios = (altura-1)/2;


        if (altura>=3 || altura%2!=0){
            for (int i = 0; i <= (altura-1)/2; i++) {
                for (int j = 0; j <= (altura-1)/2; j++) {

                }
                System.out.println();
            }

        } else{
            System.out.println("Altura errónea");
        }
    }
}
