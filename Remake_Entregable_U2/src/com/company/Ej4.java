package com.company;

import java.util.Scanner;

public class Ej4 {
    // Realiza un programa que solicite al usuario un número entero positivo con una cantidad de cifras pares.
    // Si el número que le pasamos no tiene una cantidad de  cifras par deberá volver a pedir un número.
    //Una vez tengamos el número deberemos decir qué mitades son números primos o no.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        String mitad1 = "";
        String mitad2 = "";
        int primeraMitad;
        int segundaMitad;
        boolean esPrimo = true;

        do {
            System.out.println("Introduzca un número de cifras pares");
            num = sc.nextLine();
        } while (num.length()%2!=0);

        for (int i = 0; i < num.length()/2; i++) {
            mitad1 += num.charAt(i);
        }
        for (int i = num.length()/2; i < num.length(); i++) {
            mitad2 += num.charAt(i);
        }

        primeraMitad = Integer.parseInt(mitad1);
        segundaMitad = Integer.parseInt(mitad2);

        for (int i = 2; i < primeraMitad; i++) {
            esPrimo = true;
            if(primeraMitad%i==0){
                esPrimo = false;
                break;
            }else {
                esPrimo = true;
            }
        }

        if(esPrimo){
            System.out.println("La primera mitad " + primeraMitad + " es Primo");
        } else{
            System.out.println("La primera mitad " + primeraMitad + " no es Primo");
        }

        for (int i = 2; i < segundaMitad; i++) {
            esPrimo = true;
            if(segundaMitad%i==0){
                esPrimo = false;
                break;
            }else {
                esPrimo = true;
            }
        }

        if(esPrimo){
            System.out.println("La segunda mitad " + segundaMitad + " es Primo");
        } else{
            System.out.println("La segunda mitad " + segundaMitad + " no es Primo");
        }

    }
}
