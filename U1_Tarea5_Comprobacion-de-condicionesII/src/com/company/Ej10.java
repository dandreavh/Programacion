package com.company;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, min, conv_hora, conv_min, seg_rest;
        final int SEG_DIA = 86400;

        System.out.println("Introduzca una hora");
        hora = sc.nextInt();
        System.out.println("Introduzca unos minutos");
        min = sc.nextInt();

        if ((hora >= 0 && hora <=23) && (min >=0 && min <=59)){
            conv_hora = hora*3600;
            conv_min = (min*60) + conv_hora;
            seg_rest = SEG_DIA-conv_min;

            System.out.println("Faltan " + seg_rest + " segundos, para la medianoche.");

        } else{
            System.out.println("Hora errónea");
        }

    }
}
