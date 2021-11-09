package com.company;

import java.util.Scanner;

public class Ej637 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte tam, colum=0;

        System.out.println("Escriba un número (alto)");
        tam = sc.nextByte();


        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                if(colum==0||colum==tam){
                    System.out.println("**********");
                }

            }
            System.out.println();
        }

    }
}
