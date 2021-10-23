package com.company;

import java.util.Scanner;

public class Ej2 {
    // Escribe un programa que solicite al usuario los siguientes números:
    //    Un número entero positivo
    //    Una cifra entre 0 y 9 (ambos inclusive)
    // Una vez introducidos los dos números nos debe decir cuántas ocurrencias de la cifra hay en el primer número
    // y cuáles son las posiciones (en orden en las que se han encontrado).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cifra;
        int cantOcurrecias = 0;
        int posiciones = 0;
        String posicionCifra = "";
        int solo = 0;


        System.out.println("Escriba un número");
        num = sc.nextInt();
        System.out.println("Escriba una cifra del 0 al 9");
        cifra = sc.nextInt();

        if (cifra>9 || num<0){
            System.out.println("Datos erróneos. Adiós.");
        } else{

            while(num>0){
                solo = (num%10);
                num/=10;
                if (solo==cifra){
                    cantOcurrecias++;
                    posicionCifra += String.valueOf(posiciones);
                }
                posiciones++;
            }


            System.out.println("Número de ocurrencias del " + cifra + " : " + cantOcurrecias);
            if (posicionCifra.equals("0")){
                System.out.println("Posición de la cifra " + cifra + " : Ninguna");
            } else{
                System.out.println("Posición de la cifra " + cifra + " : " + posicionCifra);
            }
        }
    }
}
