package com.company;

import java.util.Scanner;

public class Actividad1 {
    // Actividad 1: Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.println("Introduzca una palabra");
        palabra1 = sc.nextLine();
        System.out.println("Introduzca otra palabra");
        palabra2 = sc.nextLine();

        if(palabra1.length()>palabra2.length()){
            System.out.println("La palabra " +palabra2+ " es la más corta");
        } else if (palabra1.length()<palabra2.length()){
            System.out.println("La palabra " +palabra1+ " es la más corta");
        } else if (palabra1.length()==palabra2.length()){
            System.out.println("Son de la misma longitud");
        }
    }
}
