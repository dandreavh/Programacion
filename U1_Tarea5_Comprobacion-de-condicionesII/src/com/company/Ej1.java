package com.company;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.println("Escriba un día de la semana para conocer la asignatura de primera hora");
        dia = sc.nextLine();

        switch (dia){
            case "lunes":
                System.out.println("Tiene: lenguaje de marcas");
                break;
            case "martes":
                System.out.println("Tiene: sistemas informáticos");
                break;
            case "miercoles":
                System.out.println("Tiene: sistemas informáticos");
                break;
            case "jueves":
                System.out.println("Tiene: sistemas informáticos");
                break;
            case "viernes":
                System.out.println("Tiene: sistemas informáticos");
                break;
            default:
                System.out.println("No tiene clases ese día");
        }
    }
}
