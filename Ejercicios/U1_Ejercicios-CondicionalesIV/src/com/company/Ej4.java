package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, sueldo;

        System.out.println("Escriba cuántas horas a la semana ha trabajado");
        horas = sc.nextInt();

        //volver a diseñarlo teniendo en cuenta que sea 0 y que no haya negativos
        //añadir también las constantes en mayúsculas para evitar la existencia de números mágicos

        if (horas <= 40){
            sueldo = horas*12;
            System.out.println("Su sueldo esta semana sería de " + sueldo + " €");
        } else{
            sueldo = ((horas-40)*16)+(40*12);
            System.out.println("Su sueldo con horas extras esta semana sería de " + sueldo + " €");
        }
    }
}
