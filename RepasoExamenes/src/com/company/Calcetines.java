package com.company;

import java.util.Scanner;

public class Calcetines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Escriba una altura para los calcetines");
        altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            if (i<=altura/2){
                System.out.print("xxx     xxx");
            } else{
                System.out.print("xxxxxx  xxxxxx");
            }
            System.out.println();
        }
    }
}
