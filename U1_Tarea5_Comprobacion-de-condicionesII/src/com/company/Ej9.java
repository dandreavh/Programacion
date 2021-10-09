package com.company;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte dia, mes;

        System.out.println("Introduzca el día de su cumpleaños");
        dia = sc.nextByte();
        System.out.println("Introduzca el mes de su cumpleaños");
        mes = sc.nextByte();

        if ((mes==3 && (dia>=21 && dia<=31)) || (mes==4 && (dia>=1 && dia<=20))){
            System.out.println("Su signo es Aries");
        } else if ((mes==4 && (dia>=21 && dia<=30)) || (mes==5 && (dia>=1 && dia<=20))){
            System.out.println("Su signo es Tauro");
        } else if ((mes==5 && (dia>=21 && dia<=31)) || (mes==6 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Géminis");
        } else if ((mes==6 && (dia>=21 && dia<=30)) || (mes==7 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Cáncer");
        } else if ((mes==7 && (dia>=21 && dia<=31)) || (mes==8 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Leo");
        } else if ((mes==8 && (dia>=21 && dia<=31)) || (mes==9 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Virgo");
        } else if ((mes==9 && (dia>=21 && dia<=30)) || (mes==10 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Libra");
        } else if ((mes==10 && (dia>=21 && dia<=31)) || (mes==11 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Escorpio");
        } else if ((mes==11 && (dia>=21 && dia<=30)) || (mes==12 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Sagitario");
        } else if ((mes==12 && (dia>=21 && dia<=31)) || (mes==1 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Capricornio");
        } else if ((mes==1 && (dia>=21 && dia<=31)) || (mes==2 && (dia>=1 && dia<=20))) {
        System.out.println("Su signo es Acuario");
        } else if ((mes==2 && (dia>=21 && dia<=29)) || (mes==3 && (dia>=1 && dia<=20))) {
            System.out.println("Su signo es Piscis");
        } else {
            System.out.println("Su día o mes de nacimiento no concuerda");
        }
    }
}
