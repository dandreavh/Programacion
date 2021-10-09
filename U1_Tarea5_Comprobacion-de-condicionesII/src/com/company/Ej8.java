package com.company;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, primera, segunda;

        System.out.println("Introduzca un valor para 'a'");
        a = sc.nextFloat();
        System.out.println("Introduzca un valor para 'b'");
        b = sc.nextFloat();
        System.out.println("Introduzca un valor para 'c'");
        c = sc.nextFloat();

        primera = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        segunda = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        System.out.println("La primera solución sería " + primera);
        System.out.println("La segunda solución sería " + segunda);

    }
}
