package com.company;

import java.util.Arrays;

public class Ej1_Rojo {
    // Define la función esta con la siguiente cabecera:
    //public static boolean esta(int[] vector, int num)
    //Que nos devuelva si un elemento está en un vector(array) unidimensional. Usar dicho elemento para construir la siguiente función:
    //public static int[] unirSinRepetidos(int v1[],int[] v2)
    //Que una los dos vectores pero sin elementos repetidos. Usar dicha función en el método main mostrando el vector resultado por pantalla.
    public static void main(String[] args) {
        int[] v1 = {12,71,23,85,9,41,97,54};
        int[] v2 = {12,45,23,85,9,41,12};

        System.out.println(Arrays.toString(unirSinRepetidos(v1,v2)));
    }
    public static boolean esta(int[] vector, int num){
        int[] v1SinRepes = new int[vector.length];
        return false;
    }
    public static int[] unirSinRepetidos(int v1[],int[] v2){
        int[] resultado = new int[0];
        int posicion = 0;

        for (int i = 0; i < resultado.length-v2.length; i++) {
            resultado[i] = v1[i];
            posicion++;
        }

        for (int i = 0; i < resultado.length; i++) {
            resultado[posicion] = v2[i];
            posicion++;
        }

        return  resultado;
    }
}
