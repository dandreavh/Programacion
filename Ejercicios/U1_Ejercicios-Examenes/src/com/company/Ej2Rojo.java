package com.company;

import java.util.Scanner;

public class Ej2Rojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = 94026782;
        int sumaPares = 0;
        int sumaImpares = 0;
        long resto;
        long pares;
        long impares;

        while(num!=0){
            resto = num%10;
            if((resto)%2==0){
                sumaPares += resto;
            } else{
                sumaImpares += resto;
            }
            num = num/10;
        }
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
    }
}
