package com.company;

import java.util.Scanner;

public class Actividad4 {
    // Diseñar una actividad que pida al usuario que introduzca una frase por teclado
    // e indique cuántos espacios en blanco tiene.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        char elemento;
        int cantEspacios = 0;

        System.out.println("Escriba una frase");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            elemento = frase.charAt(i);
            if(elemento == ' '){
                cantEspacios++;
            }
        }

        System.out.println("Su frase tiene " +cantEspacios+ " espacios en blanco");
    }
}
