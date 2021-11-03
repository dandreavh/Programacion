package com.company;

import java.util.Scanner;

public class CadenaPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oracion, palabra;
        char espacio;
        int cantpalabras = 1;

        System.out.println("Escriba una oracion");
        oracion = sc.nextLine();

        for (int i = 0; i < oracion.length(); i++) {
            espacio = oracion.charAt(i);
            if (espacio == ' '){
                cantpalabras++;
            }
        }
        System.out.println("Hay " + cantpalabras + " palabras");
    }
}
