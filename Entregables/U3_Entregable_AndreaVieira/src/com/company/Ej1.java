package com.company;

import java.util.Arrays;

public class Ej1 {
    // Desarrollar una función que se denomine interseccionVectores. Dicha función:
    //    Recibirá como parámetros dos vectores de enteros.
    //    Devolverá un vector de enteros que contenga los números que estén en
    //    los dos vectores recibidos como parámetros. Dicho vector deberá devolverse ordenado.
    public static void main(String[] args) {
        int[] v1 = {6,12,8,9,3,13};
        int[] v2 = {13,11,4,8,6,1};

        System.out.println(Arrays.toString(interseccionVectores(v1, v2)));
    }
    public static int[] interseccionVectores(int[]v1, int[]v2){
        int [] completo = new int[0];
        int [] resultado = new int[0];

        for (int i = 0; i < v1.length; i++) {
           completo = Arrays.copyOf(completo, completo.length+1);
           completo[completo.length-1] = v1[i];
        }
        for (int i = 0; i < v2.length; i++) {
            completo = Arrays.copyOf(completo, completo.length+1);
            completo[completo.length-1] = v2[i];
        }

        System.out.println(Arrays.toString(completo));

        for (int i = 0; i < v2.length; i++) {
            if(esta(completo, completo[i])){
                Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1] = completo[i];
            }
        }

        return resultado;
    }
    public static boolean esta(int[] v, int num){
        for (int i = 0; i < v.length; i++) {
            if(v[i] == num){
                return true;
            }
        }
        return false;
    }
}
