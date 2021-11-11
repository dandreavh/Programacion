package com.company;

import java.util.Scanner;

public class Ej435 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grados;
        System.out.println("Introduzca sus grados centígrados");
        grados = sc.nextInt();
        System.out.println("En Fahrenheit: " + (9*grados/5+32));

    }
}
