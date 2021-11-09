package com.company;

import java.util.Scanner;

public class Actividad6 {
    // Actividad 6: Crear una función que, mediante un booleano,
    // indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character caracter = 5;

        System.out.println(caracter+ " ¿es una vocal? " + esVocal(caracter));
    }

    public static boolean esVocal(char c) {
        if(c == 'a' || c == 'e' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        } else{
            return false;
        }
    }
}
