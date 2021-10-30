package com.company;

import java.util.Scanner;

public class Entregable22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOriginal;
        int num;
        int resto;
        int numConEliminados = 0;
        int cantEliminados = 0;

        System.out.println("Escriba una cifra entera");
        numOriginal = sc.nextInt();
        num = numOriginal;

        while (num>0){
            resto = num%10;
            if(resto==8 || resto==0){
                cantEliminados++;
            } else{
                numConEliminados = (resto*10)+(num%10); //IMPORTANTE!!
            }
            num = num/10;
        }

        System.out.println(numConEliminados);
    }
}
