package com.company;

import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, incrementoSegundos;

        System.out.println("Introduzca una hora: ");
        horas = sc.nextInt();
        System.out.println("Introduzca unos minutos:");
        minutos = sc.nextInt();
        System.out.println("Introduzca unos segundos: ");
        segundos = sc.nextInt();
        System.out.println("¿Cuántos segundos desea incrementar?");
        incrementoSegundos = sc.nextInt();

        System.out.println("Aumentando la hora...");
//        while(incrementoSegundos>0){
//            if(segundos+incrementoSegundos<=59){
//                segundos = segundos+incrementoSegundos;
//            } else{
//                segundos = 00;
//                minutos++;
//                if (minutos + segundos<=59){
//                    minutos = minutos + segundos;
//                } else{
//                    minutos =00;
//                    horas++;
//                    if (horas + minutos <=24){
//                        horas = horas + minutos;
//                    } else{
//                        horas = 00;
//                    }
//
//                }
//
//            }
//            System.out.println(horas + ":" + minutos + ":" + segundos);
//
//            incrementoSegundos--;
//        }

        for (int i = 0; i < incrementoSegundos; i++) {
            segundos++;


        }




    }
}
