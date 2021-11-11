package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4_Tablas {
    //  Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
    //  La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
    //  (siendo n la longitud indicada anteriormente por el usuario).
    //  El jugador introduce ahora una combinación de prueba. En cada intento se mostrará como pista,
    //  para cada dígito, si es mayor menor o igual que el correspondiente de la combinación secreta.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDigit;
        int [] combinacion;
        int [] password;


        System.out.println("Introduzca una cantidad de dígitos");
        numDigit = sc.nextInt();
        combinacion = new int[numDigit];
        password = new int[numDigit];

        for (int i = 0; i < combinacion.length; i++) {
            combinacion[i] = (int) (Math.random()*5+1);
        }

        System.out.println("Contraseña generada" +Arrays.toString(combinacion));
        System.out.println("Intente adivinarla");

        for (int i = 0; i < password.length; i++) {
            System.out.println("Escriba un número");
            password[i] = sc.nextInt();
        }

        // lo tengo que meter en un bucle y hacerlo con un buleano
        for (int i = 0; i < combinacion.length; i++) {
            if (combinacion[i]>password[i]){
                System.out.println("El número en la posición " +i+ " es mayor");
            } else if (combinacion[i]<password[i]){
                System.out.println("El número en la posición " +i+ " es menor");
            } else{
                System.out.println("El número en la posición " +i+ " es correcto");
            }
        }

    }
}
