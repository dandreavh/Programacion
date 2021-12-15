package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    /*
    Realizar una función mediaVectores que:
     Recibe dos vectores de enteros de una dimensión
     Devuelve un único vector de float cuyos elementos serán las medias de los elementos de dicha posición en los vectores recibidos.

    En caso de que uno de los dos vectores sea más largo, en las posiciones restantes se colocarán los valores del vector más largo.
    Los vectores deberán ser rellenados por el usuario. Se le solicitará el tamaño y los valores de los dos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1;
        int[] v2;
        int tam;
        int valor;

        System.out.println("Indique el tamaño del vector 1");
        tam = sc.nextInt();
        v1 = new int[tam];
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduzca un valor para el vector 1");
            valor = sc.nextInt();
            v1[i] = valor;
        }

        System.out.println("Indique el tamaño del vector 2");
        tam = sc.nextInt();
        v2 = new int[tam];
        for (int i = 0; i < v2.length; i++) {
            System.out.println("Introduzca un valor para el vector 2");
            valor = sc.nextInt();
            v2[i] = valor;
        }

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        System.out.println("La media de la unión de cada elementos de los vectores anteriores es: " +Arrays.toString(mediaVectores(v1, v2)));

    }

    public static float[] mediaVectores (int[] v1, int[] v2){
        float[] resultado;
        float media;
        int[] vMayor;
        int tamMenor;
        int pos = 0;

        if(v1.length>v2.length){
            vMayor = v1;
            tamMenor = v2.length;
        } else{
            vMayor = v2;
            tamMenor = v1.length;
        }
        resultado = new float[vMayor.length];

        for (int i = 0; i < resultado.length; i++) {
            if(i<tamMenor){
                resultado[i] = (v1[i]+v2[i])/2;
            } else{
                resultado[i] = vMayor[pos];
            }
            pos++;
        }
        return resultado;
    }
}
