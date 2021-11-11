package com.company;

import java.util.Scanner;

public class Flecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        do{
            System.out.println("Escriba una altura válida");
            altura = sc.nextInt();
        } while (altura<3 || altura%2==0);



    }
}
