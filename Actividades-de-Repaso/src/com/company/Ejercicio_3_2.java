package com.company;

import java.util.Scanner;

public class Ejercicio_3_2 {
    //Ejercicio3-2: Crea un programa que pida al usuario su año de nacimiento y el año actual
    // (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short aNac, aAct;

        System.out.println("Indique su año de nacimiento");
        aNac = sc.nextShort();
        System.out.println("Indique el año actual");
        aAct = sc.nextShort();

        System.out.println("Su edad es de " + (aAct-aNac) + " años");
    }
}
