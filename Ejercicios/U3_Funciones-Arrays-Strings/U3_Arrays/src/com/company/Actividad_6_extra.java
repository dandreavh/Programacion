package com.company;

public class Actividad_6_extra {
    // Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos
    // entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
    // NOTA IMPORTANTE: Los números no pueden repetirse.
    //INCOMPLETO!!
    public static void main(String[] args) {
        int[][] numeros = new int[6][10];

        for (int i = 0; i < numeros.length; i++) { //filas 6
            for (int j = 0; j < numeros[i].length; j++) { //columnas 10
                numeros[i][j] = (int) (Math.random()*(1000-0)+0);
            }
        }
    }
    public static boolean esta(int[]v, int num){
        for (int i = 0; i <v.length ; i++) {
            if(v[i]==num){
                return true;
            }
        }
        return false;
    }
}
