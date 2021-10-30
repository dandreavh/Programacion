package com.company;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un número");
        num = sc.nextInt();

        if (num%2==0 || num/5==0){
            System.out.println("Su número es par o divisible entre 5");
        } else{
            System.out.println("Su número no es ni par ni divisible entre 5");
        }
    }
}
