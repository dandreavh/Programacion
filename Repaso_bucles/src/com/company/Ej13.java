package com.company;

import java.util.Scanner;

public class Ej13 {
    // Actividad8-13:  Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;
        int cant_suspensos = 0;
        int cant_condicionados = 0;
        int cant_aprobados = 0;
        byte limite = 1;

        while (limite<=6){
            System.out.println("Introduzca una nota");
            nota = sc.nextFloat();

            if (nota<4){
                cant_suspensos++;
            } else if (nota>4){
                cant_aprobados++;
            } else if (nota==4){
                cant_condicionados++;
            }
            limite++;
        }
        System.out.println("Cantidad de aprobados: "+cant_aprobados);
        System.out.println("Cantidad de suspensos: "+cant_suspensos);
        System.out.println("Cantidad de condicionados: "+cant_condicionados);

    }
}
