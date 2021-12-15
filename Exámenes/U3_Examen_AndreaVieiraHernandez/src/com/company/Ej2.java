package com.company;

import java.util.Arrays;

public class Ej2 {
    /*
      Crear una función insertarValor que:
        Reciba como parámetros un vector de enteros, un valor y una posición
        Devuelva como resultado un vector en el que habremos insertado el valor que le hemos pasado en la posición indicada. De esta manera el vector resultado tendrá un elemento más.
     */
    public static void main(String[] args) {
        int[] vector = { 1 , 2 , 3 , 4 , 5 };
        int posicion = 3;
        int valor = 8;
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(insertarValor(vector, valor, posicion)));
    }
    public static int[] insertarValor(int[] v, int valor, int posicion){
        int[] resultado = new int[v.length+1];
        for (int i = 0; i < resultado.length; i++) {
            if(i==posicion){
                resultado[i] = valor;
            } else{
                if(i< posicion){
                    resultado[i] = v[i];
                } else{
                    resultado[i] = v[i-1];
                }
            }
        }
        return resultado;
    }
}
