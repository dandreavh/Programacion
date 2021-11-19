package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_2_extra {
    // Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación, las palabras correspondientes
    // a colores se deben almacenar alcomienzo y las que no son colores a continuación. Puedes utilizar tantos
    // arraysauxiliares como quieras. Los colores que conoce el programa deben estar enotro array y son los siguientes:
    // verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] resultado = new String[0];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Escriba una palabra");
            palabras[i] = sc.nextLine();
            if (esta(colores,palabras[i])){
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1] = palabras[i];
            }
        }

        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(resultado));

        for (int i = 0; i < palabras.length; i++) {
            if (!esta(colores,palabras[i])){
                resultado = Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1] = palabras[i];
            }
        }
        System.out.println(Arrays.toString(resultado));
    }

    public static boolean esta(String[] palabras, String palabra){
        for (int i = 0; i < palabras.length; i++) {
            if(palabras[i].equals(palabra)){
                return true;
            }
        }
        return false;
    }
}
