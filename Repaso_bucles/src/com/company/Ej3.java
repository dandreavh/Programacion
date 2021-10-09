package com.company;

import java.util.Scanner;

public class Ej3 {
    //Actividad8-3: Realizar un aplicación que genere un número aleatorio entre 1 y 100.
    // El jugador debe ir probando números tratando de acertarlo.
    // El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
    // El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_user;
        int num_aleatorio = (int)(Math.random() * 100+1);

        do {
            System.out.println("Adivina el número secreto");
            num_user = sc.nextInt();

            if (num_user==-1) {
                System.out.println("Se ha rendido. El número secreto era " + num_aleatorio);
                break;
            } else if (num_user>num_aleatorio){
                System.out.println("El número secreto es menor, inténtelo de nuevo o ríndase escribiendo -1");
            } else if (num_user<num_aleatorio){
                System.out.println("El número secreto es mayor, inténtelo de nuevo o ríndase escribiendo -1");
            } else{
                System.out.println("Ha acertado, el número secreto era " + num_aleatorio);
            }

        } while (num_user!=num_aleatorio);
    }
}
