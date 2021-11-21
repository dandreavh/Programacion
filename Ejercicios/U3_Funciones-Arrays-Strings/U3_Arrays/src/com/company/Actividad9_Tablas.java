package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad9_Tablas {
    // Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva,
    // y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] apuesta = new int[6];
        int[] combiGanadora = new int[6];

        for (int i = 0; i < apuesta.length; i++) {
            System.out.println("Introduzca los número de su apuesta");
            apuesta[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(apuesta));

        do{
            int num = (int) (Math.random()*(49-1)+1);
            if(!esta(combiGanadora, num)){
                combiGanadora = Arrays.copyOf(combiGanadora, combiGanadora.length+1);
                combiGanadora[combiGanadora.length-1] = num;
            }

        } while (combiGanadora.length!=6);

//        for (int i = 0; i < combiGanadora.length; i++) {
//            combiGanadora[i] = (int) (Math.random()*(50-1)+1); // añadir con copyOf
//        }

        System.out.println(Arrays.toString(combiGanadora));

        System.out.println("Usted tiene: " +cantAciertos(apuesta, combiGanadora)+ " aciertos");
    }

    public static int cantAciertos (int[] apuestas, int[] combiGanadora){
        int cantidad = 0;
        for (int i = 0; i < apuestas.length; i++) {
          if(esta(combiGanadora, apuestas[i])){
              cantidad++;
          }
        }
        return cantidad;
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
