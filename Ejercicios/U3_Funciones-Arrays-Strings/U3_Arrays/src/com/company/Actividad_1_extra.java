package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad_1_extra {
    // Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios comprendidos
    // entre 0 y 500 (ambos incluidos). A continuación, el programa mostrará el array y preguntará si el usuario
    // quiere destacar el máximo o el mínimo.
    // Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int mayor = 0, menor = 500;
        int eleccion;
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numRandom = (int) (Math.random()*(501-0)+0);
            numeros[i] = numRandom;
            if(numRandom>mayor){
                mayor = numRandom;
                posicionMayor = i;
            }
            if (numRandom<menor){
                menor = numRandom;
                posicionMenor = i;
            }
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("mayor " + mayor);
        System.out.println("menor " + menor);
        System.out.println("Pos mayor " +posicionMayor);
        System.out.println("Pos menor " +posicionMenor);
        System.out.println("Identifique si quiere destacar máximo (1) o mínimo (2)");
        eleccion = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if(eleccion==1){
               if(numeros[i]==mayor){
                   System.out.print("**"+numeros[i]+"**");
               } else{
                   System.out.print(" "+numeros[i]+" ");
               }
            } else if (eleccion==2){
                if(numeros[i]==menor){
                    System.out.print("**"+numeros[i]+"**");
                } else{
                    System.out.print(" "+numeros[i]+" ");
                }
            }
        }
    }
}
