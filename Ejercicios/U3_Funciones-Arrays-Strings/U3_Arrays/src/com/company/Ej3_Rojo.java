package com.company;

import java.util.Arrays;

public class Ej3_Rojo {
    //Realiza un programa que calcule la estatura media, mínima y máxima en centímetros
    // de personas de diferentes países. El array que contiene los nombres de
    // los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}.
    // Los datos sobre las estaturas se deben simular mediante un
    //array de 4 filas por 10 columnas con números aleatorios generados al azar
    // entre 140 y 210. Los decimales de la media se pueden despreciar.
    // Los nombres de los países se deben mostrar utilizando el array de países
    // (no se pueden escribir directamente).
    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int [][] estaturas = new int[4][10];
        int media = 0;
        int minima = 210;
        int maxima = 0;

        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                int valor = (int) (Math.random()*(211-140)+140);
                estaturas[i][j] = valor;
                if(valor>maxima){
                    maxima = valor;
                } else if (valor< minima){
                    minima = valor;
                }
                media += valor;
            }
            System.out.println("Media: " +(media /= estaturas.length));
            System.out.println("Mínima: " +minima);
            System.out.println("Máxima: " +maxima);

            maxima = 0;
            minima = 0;
            media = 0;
        }
    }
}
