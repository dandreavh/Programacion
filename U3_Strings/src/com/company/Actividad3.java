package com.company;

import java.util.Scanner;

public class Actividad3 {
    // Diseñar un programa que pida una frase al usuario,
    // e indique si el carácter de la posición central es o no un espacio.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Escriba una frase");
        frase = sc.nextLine();

        if(frase.charAt(frase.length()/2) == ' '){
            System.out.println("El carácter de la posición central es un espacio");
        } else{
            System.out.println("El carácter de la posición central no es un espacio, es " +frase.charAt(frase.length()/2));
        }
    }
}
