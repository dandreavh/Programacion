package com.company;

import java.util.Scanner;

public class Ej3Rojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        String espaciosBlancos = "-";
        int cantHuecos = altura-1;
        int cantCaracteres = 1;

        System.out.println("Introduzca la altura total del reloj de arena");
        altura = sc.nextInt();

        // valora si la altura es mayor que 3 e impar
        if(altura>2 && (altura%2!=0)){
            // filas
            for (int i = 0; i < altura; i++) {
                // columnas
                for (int j = 0; j < altura; j++) {
                    // la primera y la última fila
                    if(i==0 || i==altura-1){
                        System.out.print("X");
                    } else if(i==j || (i+j)==altura-1){
                        System.out.print("X");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else{
            System.out.println("Dato introducido erróneo");
        }

    }
}
