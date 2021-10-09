package com.company;

import java.util.Scanner;

public class Ej626 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num = 0, alto, ancho, fila = 0;

        System.out.println("Escriba la altura");
        alto = sc.nextByte();
        System.out.println("Escriba la anchura");
        ancho = sc.nextByte();

        do{
            System.out.print("*");
            while (fila<alto){
                System.out.println("*");
                fila++;
            }
           fila++;
        } while (fila<alto);
    }
}
