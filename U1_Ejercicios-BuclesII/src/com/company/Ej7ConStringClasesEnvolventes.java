package com.company;

import java.util.Scanner;

public class Ej7ConStringClasesEnvolventes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        Character c = '0';

        System.out.println("Escriba un número");
        num = sc.nextLine();

        for (int i = num.length(); i < 0; i++) {
            System.out.println();
        }
    }
}
