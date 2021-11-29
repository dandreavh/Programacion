package com.company;

import java.util.Arrays;

public class Ej1_EntregableManana {
    // Define la función mezcla con la siguiente cabecera: public static int[] mezcla(int[] a, int[] b)
    // Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar los números
    // de ambos de forma alterna, se coge un número de a, luego de b, luego de a, etc. Los vectores y b pueden tener
    // longitudes diferentes; por tanto, si se terminan los números de un array se terminan de coger todos los que
    // quedan del otro.
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = {98,87,76,65,54,43,32,21};

        System.out.println("La combinación de a " + Arrays.toString(a)+ " y de b " +Arrays.toString(b)+ " da lugar a " +mezcla(a,b));

    }
    public static int[] mezcla(int[] a, int[] b){
        int [] resultado = new int[a.length+b.length];
        int pos =0;
        for (int i = 0; i < resultado.length; i++) {
            if(a.length>b.length){

            } else if(a.length<b.length){

            } else{

            }
        }

        return resultado;
    }
}
