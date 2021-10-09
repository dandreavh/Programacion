package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte hora;

        System.out.println("Escriba una hora en formato entero");
        hora = sc.nextByte();

        if (hora>=6 && hora<=12){
            System.out.println("Buenos días");
        } else if (hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        } else if ((hora>=21 && hora<=24) || (hora>=0 && hora<=5)){
            System.out.println("Buenas noches");
        } else{
            System.out.println("Hora no válida");
        }
    }
}
