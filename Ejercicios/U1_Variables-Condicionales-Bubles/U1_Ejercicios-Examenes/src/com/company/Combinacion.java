package com.company;

import java.util.Scanner;

public class Combinacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1, num2, combiPares = "", combiImpares ="";
        int cifra;

        System.out.println("Escriba el primer número");
        num1 = sc.nextLine();
        System.out.println("Escriba el segundo número");
        num2 = sc.nextLine();

        if(num1.length()==num2.length()){
            for (int i = 0; i < num1.length(); i++) {
                if(num1.charAt(i)%2==0){
                    combiPares += ""+num1.charAt(i);
                } else {
                    combiImpares += "" + num1.charAt(i);
                }
                if(num2.charAt(i)%2==0){
                    combiPares += ""+num2.charAt(i);
                } else{
                    combiImpares += ""+num2.charAt(i);
                }
            }
            System.out.println("Cadena con números pares: "+combiPares);
            System.out.println("Cadena con números impares: "+combiImpares);
        } else{
            System.out.println("Datos inválidos");
        }
    }
}
