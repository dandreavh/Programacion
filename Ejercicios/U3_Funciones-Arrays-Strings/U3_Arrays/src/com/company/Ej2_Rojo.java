package com.company;

import java.util.Arrays;

public class Ej2_Rojo {
    // Define la función convierteArrayEnString con la siguiente cabecera:
    //public static String convierteArrayEnString(int[] a)
    //Esta función toma como parámetro un array que contiene números y devuelve
    //una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
    //vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
    //devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
    //“62501”.
    //Usar dicha función en el método main mostrando el resultado por pantalla.
    public static void main(String[] args) {
        int [] enteros = {27, 12, 94, 18, 10, 30, 16};
        System.out.println(convierteArrayEnString(enteros));
    }
    public static String convierteArrayEnString(int[] a){
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += a[i] + "";
        }

        result = " '' " +result+ " '' ";

        return result;
    }
}
