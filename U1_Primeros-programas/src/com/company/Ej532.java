package com.company;

import java.util.Scanner;

public class Ej532 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escriba un num");
        num = sc.nextInt();

        if (num == 0){
            System.out.println("es 0");
        } else{
            if (num > 0){
                System.out.println("positivo");
            } else{
                System.out.println("negativo");
            }
        }
    }
}
