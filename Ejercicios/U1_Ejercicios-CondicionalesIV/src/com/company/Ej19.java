package com.company;

import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        byte hora, min;
        int horaMin, minParcial, minTotal;

        System.out.println("Indique un día de la semana");
        dia = sc.nextLine();
        System.out.println("Indique una hora");
        hora = sc.nextByte();
        System.out.println("Indique unos minutos");
        min = sc.nextByte();

        switch (dia){
            case "Lunes":
                horaMin = (((24+24+24+24+15)-hora)*60);
                minParcial = (59-min);
                minTotal = horaMin+minParcial;
                System.out.println("Faltan " + minTotal + " minutos para el fin de semana");
                break;
            case "Martes":
                horaMin = (((24+24+24+15)-hora)*60);
                minParcial = (59-min);
                minTotal = horaMin+minParcial;
                System.out.println("Faltan " + minTotal + " minutos para el fin de semana");
                break;
            case "Miercoles":
                horaMin = (((24+24+15)-hora)*60);
                minParcial = (59-min);
                minTotal = horaMin+minParcial;
                System.out.println("Faltan " + minTotal + " minutos para el fin de semana");
                break;
            case "Jueves":
                horaMin = (((24+15)-hora)*60);
                minParcial = (59-min);
                minTotal = horaMin+minParcial;
                System.out.println("Faltan " + minTotal + " minutos para el fin de semana");
                break;
            case "Viernes":
                if(hora>=15 && min >=0){
                    System.out.println("Ya estás en fin de semana");
                } else {
                    horaMin = ((15-hora)*60);
                    minParcial = (59-min);
                    minTotal = horaMin+minParcial;
                    System.out.println("Faltan " + minTotal + " minutos para el fin de semana");
                }
                break;
            default:
                System.out.println("Estás en fin de semana o te has equivocado");
        }

    }
}
