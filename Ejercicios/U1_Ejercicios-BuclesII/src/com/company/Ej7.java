package com.company;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numReves = 0;

        System.out.println("Introduza un número");
        num = sc.nextInt();

        while(num!=0){
            numReves = (numReves*10)+(num%10); // Multiplico para que de 123 > (30 =numreves*10) + 2(num%10)
            num = num/10; // actualizo el valor de num, con lo que me va quedando del bucle al quitar el último
        }
        System.out.printf("Su número al revés es " + numReves);
    }
}
