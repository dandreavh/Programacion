package com.company;

import java.util.Scanner;

public class Ej1Rojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1;
        String num2;
        char numSolo;
        String cadenaPares = "";
        String cadenaImpares = "";

        System.out.println("Escriba un número");
        num1 = sc.nextLine();
        System.out.println("Escriba otro número");
        num2 = sc.nextLine();

        for (int i = 0; i < num1.length(); i++) {
            numSolo = num1.charAt(i);
            if(numSolo%2==0){
                cadenaPares += numSolo;
            } else{
                cadenaImpares += numSolo;
            }
            numSolo = num2.charAt(i);
            if(numSolo%2==0){
                cadenaPares += numSolo;
            } else{
                cadenaImpares += numSolo;
            }
        }



        System.out.println("El número formado por los dígitos pares es " + cadenaPares);
        System.out.println("El número formado por los dígitos impares es " + cadenaImpares);

    }
}
