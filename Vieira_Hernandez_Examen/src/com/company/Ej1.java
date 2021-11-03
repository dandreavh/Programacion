package com.company;

import java.util.Scanner;

public class Ej1 {
    // Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe introducir la altura.
    // En esa altura va incluida la estrella y el tronco. Suponemos que el usuario introduce una altura mayor
    // o igual a 4.
    // Si la altura no es correcta se volverá a pedir hasta que el usuario introduzca una altura correcta.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura, cantHuecos, cantCaracteres;

        do{
            System.out.println("Introduzca una altura superior  o igual a 4");
            altura = sc.nextInt();
        } while (altura<4);

        cantHuecos = altura/2;
        cantCaracteres =1;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura+2; j++) {
                if(i==0 && j==(altura+2)/2){
                    System.out.print("*");
                } else if(i==altura-1 && j==(altura+2)/2){
                    System.out.print("Y");
                } else if(i==altura-2 || i+j==altura-2){
                    System.out.print("^");
                } else{
                    System.out.print("-");
                }

            }
            cantHuecos--;
            cantCaracteres++;
            System.out.println();
        }

    }
}
