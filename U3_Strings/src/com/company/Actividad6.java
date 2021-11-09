package com.company;

import java.util.Scanner;

public class Actividad6 {
    // Diseñar el juego "Acierta la contraseña".
    // El primer jugador introduce una contraseña, el segundo, debe insertar otra intentando acertarla
    // con las pistas que le dará el programa: número de caracteres, primera y última letra.
    // El programa debe escribir "Acertaste" o "Fallaste".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena1, contrasena2;
        int cantCaracteres = 0;
        char primero, ultimo;

        System.out.println("Jugador 1, introduzca una contraseña");
        contrasena1 = sc.nextLine();

        cantCaracteres = contrasena1.length();
        primero = contrasena1.charAt(0);
        ultimo = contrasena1.charAt(contrasena1.length()-1);

        System.out.println("Pistas: la contraseña tiene " +cantCaracteres+ " caracteres, el primer caracter es "
        +primero+ " y el último es " +ultimo);

        System.out.println("Jugador 2, intente adivinar");
        contrasena2 = sc.nextLine();

        if(contrasena2.equals(contrasena1)){
            System.out.println("Acertaste");
        } else{
            System.out.println("Fallaste");
        }

    }
}
