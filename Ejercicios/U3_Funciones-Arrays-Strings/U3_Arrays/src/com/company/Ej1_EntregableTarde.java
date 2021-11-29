package com.company;

import java.util.Arrays;

public class Ej1_EntregableTarde {
    // Crea la función filtraPrimos que:
    //    Recibe un array de enteros
    //    Devuelve un array de enteros con todos los primos que se encuentran en el array origen
    // Obviamente el tamaño del array que se devuelve será de una longitud menor o igual al que se pasa como parámetro. 
    // Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector. 
    // Si no existe ningún número primo en el vector original, se devuelve un array con el número -1 como único elemento.
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("El array original: " +Arrays.toString(numeros));
        System.out.println("El array compuesto por solo primos: " +Arrays.toString(filtraPrimos(numeros)));
    }
    public static int[] filtraPrimos(int[] numeros){
        int[] soloPrimos = new int[0];
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            if(esPrimo(num)){
                soloPrimos = Arrays.copyOf(soloPrimos, soloPrimos.length+1);
                soloPrimos[soloPrimos.length-1] = num;
            }
        }
        return soloPrimos;
    }
    public static boolean esPrimo(int n){
        boolean primo = true;;
        for (int j = 2; j < n; j++) {
            primo = true;
            if(n%j==0){
                primo = false;
                break;
            }
        }
        return primo;
    }
}
