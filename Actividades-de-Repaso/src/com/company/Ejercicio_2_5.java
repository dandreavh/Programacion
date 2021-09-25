package com.company;

import java.util.Scanner;

public class Ejercicio_2_5 {
    //Ejercicio2-5: Crea un programa que pida al usuario una temperatura en grados centígrados y
    // calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int centigrados;

        System.out.println("Introduzca una temperatura en grados centígrados");
        centigrados = sc.nextInt();

        System.out.println(centigrados + "ºC en Fahrenhet = " + (9*centigrados/5+32));
    }
}
