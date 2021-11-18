package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {
    // Implementar una función sinRepetidos() con el prototipo:
    //int[] sinRepetidos(int t[]
    //que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado los datos repetidos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cadenaInicial = {2,4,5,8,7,5,2,1};
        int[] result = sinRepetidos(cadenaInicial);
        System.out.println();

    }
    public static int[] sinRepetidos(int vector[]){
        int[] result = new int[0];
        for (int i = 0; i < vector.length; i++) {
            if(!esta(result, vector[i])){
                Arrays.copyOf(result, result.length+1);
                result[result.length-1] = vector[i];
            }
        }
        return result;
    }
    public static boolean esta (int vector[], int elemento){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==elemento){
                return true;
            }
        }
        return false;
    }


}
