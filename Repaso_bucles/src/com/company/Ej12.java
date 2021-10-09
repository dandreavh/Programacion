package com.company;

import java.util.Scanner;

public class Ej12 {
    //Actividad8-12: Pedir 5 calificaciones de alumnos. El programa debe decir,
    // al final, si hay algún suspenso o no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;
        int limite = 1;
        int cant_suspensos = 0;
        boolean suspensos = true;

        while (limite<=5){
            System.out.println("Escriba una nota");
            nota = sc.nextFloat();
            limite++;

            if(nota<5){
                cant_suspensos++;
            }
        }

        if (cant_suspensos>=1){
            suspensos = true;
        } else{
            suspensos = false;
        }

        System.out.println("En sus notas, ¿hay suspensos? " + suspensos + " y hay " + cant_suspensos + " suspensos.");
    }
}
