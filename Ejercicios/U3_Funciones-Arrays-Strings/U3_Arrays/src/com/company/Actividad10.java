package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad10 {
    // Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional
    // que debe rellenar de la siguiente forma: se leerá por teclado una serie de números, guardando en la
    // tabla los pares hasta que esté llena,
    // e ignorando los impares. La función tiene que devolver la cantidad de impares desechados.
    public static void main(String[] args) {

        int[] numeros = new int[8];
        System.out.println("Número de impares: " +rellenaPares(numeros));
    }
    public static int rellenaPares(int[] tabla){
        int[] tablaPares = new int[0];
        int cantImpares = 0;
        int posPares = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Introduzca un dato");
            int dato = sc.nextInt();
            if (tabla[i]%2==0){
                tablaPares[posPares] = dato;
                posPares++;
            } else{
                cantImpares++;
            }
            System.out.println("La tabla con los pares queda: " + Arrays.toString(tablaPares));
        }
        return cantImpares;
    }
}
