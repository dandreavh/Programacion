package com.company;

import java.util.Scanner;

public class Ej635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escriba un número");
        num = sc.nextInt();

        for(int i=0; i<=num; i++){
            if (i%3==0 && i%7==0){
                System.out.println(i);
            }
        }
    }
}
