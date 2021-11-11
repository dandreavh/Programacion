package com.company;

import java.util.Scanner;

public class Ej746 {
    // Crea un programa que pida al usuario 10 números enteros largos,
    // los guarde en un array y después pregunte qué número quiere buscar y
    // le contestará si ese número forma parte de los 10 iniciales o no. Volverá a preguntar
    // qué número desea buscar,
    // hasta que el usuario introduzca "-1" para indicar que no quiere seguir buscando.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] numeros = new long[10];
        long n;
        boolean numEsta = false;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escriba un número largo");
            numeros[i] = sc.nextLong();
        }

        System.out.println("Introduza un número para saber si está en uno de los introducidos");
        n = sc.nextLong();

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==n){
                numEsta = true;
                break;
            } else{
                numEsta = false;
            }
        }

        if(numEsta){
            System.out.println("El número está entre los 10 introducidos");
        } else{
            System.out.println("El número no se encuentra entre los introducidos");
        }
    }
}
