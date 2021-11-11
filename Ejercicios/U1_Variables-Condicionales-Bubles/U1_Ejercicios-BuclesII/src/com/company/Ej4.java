package com.company;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número");
            num = sc.nextInt();

            if(num>=0){
                System.out.println("Es Positivo");
                positivos++;
            } else{
                System.out.println("Es Negativo");
                negativos++;
            }
        }

        System.out.println("En total hay " + positivos + " positivos, y " + negativos + " negativos");

    }
}
