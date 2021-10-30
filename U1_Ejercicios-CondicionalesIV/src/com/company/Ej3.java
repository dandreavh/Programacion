package com.company;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte dia;

        System.out.println("Escriba un número del 1 al 7 para conocer qué día de la semana es");
        dia = sc.nextByte();

        switch (dia){
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No existe ese número de día de la semana");
        }
    }
}
