package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej747 {
    // Crea un programa que prepare un array de hasta 1000 números enteros.
    // El usuario podrá elegir añadir un nuevo dato
    // (tendrás que llevar la cuenta la cantidad de datos que ya hay introducidos),
    // buscar para comprobar si aparece un cierto dato, o salir del programa.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] cadena = new int[1000];
        int posicion = 0;
        int opcion;
        int numero;

        do {
            System.out.println("Escriba 1 para añadir un dato, escriba 2 para buscar, escriba 3 para salir del programa");
            opcion = sc.nextInt();

            if(opcion==1){
                System.out.println("Introduzca el dato que desea añadir");
                numero = sc.nextInt();
                cadena[posicion] = numero;
                posicion++;
            } else if (opcion==2){
                System.out.println("Introduzca un dato para ver si está en la cadena");
                numero = sc.nextInt();
                boolean datoEsta = false;
                for (int i = 0; i < posicion; i++) {
                    if (numero == cadena[i]) {
                        datoEsta = true;
                        break;
                    }
                }
                if(datoEsta){
                    System.out.println("Su dato " +numero+ " está en la cadena " + Arrays.toString(cadena));
                } else{
                    System.out.println("Su dato " +numero+ " no está en la cadena " + Arrays.toString(cadena));
                }

            } else if (opcion==3){
                continue;
            }

        } while (opcion!=3);


    }
}
