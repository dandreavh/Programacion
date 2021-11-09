package com.company;

import java.util.Scanner;

public class Ej535 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escriba un num");
        num = sc.nextInt();

        if ((num%2)==0){
            System.out.println("es par");
        } else{
            System.out.println("es impar");
        }
    }
}
