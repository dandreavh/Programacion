package com.company;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cifra;
        int giro=0;
        int solo=0;
        String cadena = "";
        int cantOcurrencias = 0;
        int posicion = 0;
        int posCifra = 0;
        int numDerecho;

        System.out.println("Escriba un número");
        num = sc.nextInt();
        System.out.println("Escriba una cifra");
        cifra = sc.nextInt();

        while (num>0){
            solo = num%10;
            num/=10;
            if(solo!=cifra){
                giro = (giro*10)+solo;
            } else{
                cantOcurrencias++;
            }
            posicion++;
        }


    }
}
