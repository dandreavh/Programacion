package com.company;

import java.util.Scanner;

public class Entregable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numSolo;
        int numInverso = 0;


        System.out.println("Escriba un número para saber si es capicúa");
        num = sc.nextInt();
        numSolo = num;

        while (num>0){
            num = num/10;
            numSolo = num%10;
            numInverso = (numInverso + numSolo)*10;
        }
        numInverso = numInverso+numSolo;
        System.out.println(numInverso);
    }
}
